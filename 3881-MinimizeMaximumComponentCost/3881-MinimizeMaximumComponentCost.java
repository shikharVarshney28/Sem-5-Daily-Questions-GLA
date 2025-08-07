// Last updated: 8/7/2025, 2:43:08 PM
class Solution {
    public class DSU {
        int comp;
        int parent[];
        int rank[];
        int max = 0;

        DSU(int n) {
            this.comp = n;
            this.parent = new int[n];
            this.rank = new int[n];
            for (int i = 0; i < n; i++) {
                parent[i] = i;
            }
        }

        int fp(int n) {
            if (n == parent[n])
                return n;
            parent[n] = fp(parent[n]);
            return parent[n];
        }

        boolean union(int u, int v, int val) {
            int pu = fp(u);
            int pv = fp(v);
            if (pu == pv)
                return false;
            if (rank[pu] > rank[pv]) {
                parent[pv] = pu;
            } else if (rank[pu] < rank[pv]) {
                parent[pu] = pv;
            } else {
                parent[pv] = pu;
                rank[pu]++;
            }
            max = Math.max(max, val);
            comp--;
            return true;
        }
    }

    public int minCost(int n, int[][] edges, int k) {
        Arrays.sort(edges, (a, b) -> (a[2] - b[2]));
        DSU dsu = new DSU(n);
        int i = 0;
        while (dsu.comp != k) {
            dsu.union(edges[i][0], edges[i][1], edges[i][2]);
            i++;
        }
        return dsu.max;
    }
}