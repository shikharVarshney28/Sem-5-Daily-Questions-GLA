// Last updated: 8/7/2025, 2:50:05 PM
class Solution {
    public class disjointUnion {
        int parent[];
        int rank[];
        int components;

        disjointUnion(int n) {
            this.parent = new int[n + 1];
            this.rank = new int[n + 1];
            this.components = n;
            for (int i = 0; i < n; i++) {
                parent[i] = i;
            }
        }

        public int findRootParent(int node) {
            if (node == parent[node])
                return node;
            parent[node] = findRootParent(parent[node]); // path Compression
            return parent[node];
        }

        boolean unionByRank(int node1, int node2) {
            int parentOfNode1 = findRootParent(node1);
            int parentOfNode2 = findRootParent(node2);
            if (parentOfNode1 == parentOfNode2)
                return false;
            if (rank[parentOfNode1] < rank[parentOfNode2]) {
                parent[parentOfNode1] = parentOfNode2;
            } else if (rank[parentOfNode1] > rank[parentOfNode2]) {
                parent[parentOfNode2] = parentOfNode1;
            } else {
                parent[parentOfNode2] = parentOfNode1;
                rank[parentOfNode1]++;
            }
            components--;

            return true;
        }

    }

    public int maxNumEdgesToRemove(int n, int[][] edges) {
        disjointUnion Alice = new disjointUnion(n);
        disjointUnion Bob = new disjointUnion(n);
        Arrays.sort(edges, new Comparator<int[]>() {
            public int compare(int a[], int b[]) {
                return b[0] - a[0];
            }
        });
        int used = 0;
        for (int i[] : edges) {
            if (i[0] == 3) {
                boolean f = false;
                if (Alice.unionByRank(i[1], i[2])) {
                    f = true;
                }
                if (Bob.unionByRank(i[1], i[2])) {
                    f = true;
                }
                if (f)
                    used++;
            } else if (i[0] == 1 && Alice.unionByRank(i[1], i[2])) {
                used++;
            } else if (i[0] == 2 && Bob.unionByRank(i[1], i[2])) {
                used++;
            }
        }
        if (Alice.components == 1 && Bob.components == 1)
            return edges.length - used;
        return -1;
    }
}