// Last updated: 8/7/2025, 2:51:20 PM
class Solution {
    public static class disjointUnion {
        int parent[];
        int rank[];
        int components;

        disjointUnion(int n) {
            this.parent = new int[n];
            this.rank = new int[n];
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

    public int makeConnected(int n, int[][] connections) {
        if (connections.length < n - 1)
            return -1;
        disjointUnion dsu = new disjointUnion(n);
        int used = 0;
        for (int i[] : connections) {
            if (dsu.unionByRank(i[0], i[1]))
                used++;
        }
        int connectedComp = used + 1;
        //eithers (the comp to be connected will be more or less) or (the wores will be more or less)

        int unusedWire = connections.length - used;

        if ((n - connectedComp) > unusedWire)
            return -1;

        else if ((n - connectedComp) == unusedWire)
            return unusedWire;

        return n - connectedComp;
    }
}