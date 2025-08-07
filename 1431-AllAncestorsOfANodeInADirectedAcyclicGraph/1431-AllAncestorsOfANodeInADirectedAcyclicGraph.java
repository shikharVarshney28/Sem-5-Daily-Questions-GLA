// Last updated: 8/7/2025, 2:51:25 PM
class Solution {
    List<List<Integer>> ans;

    void find(List<List<Integer>> adj, int src, int ancestor, boolean added[]) {
        if (added[src])
            return;

        if (!added[src] && src != ancestor) {
            ans.get(src).add(ancestor);
            added[src] = true;
        }

        for (int i : adj.get(src)) {

            find(adj, i, ancestor, added);
        }
    }

    public List<List<Integer>> getAncestors(int n, int[][] edges) {
        ans = new ArrayList<>();
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
            ans.add(new ArrayList<>());
        }
        for (int i[] : edges) {
            adj.get(i[0]).add(i[1]);
        }
        for (int i = 0; i < n; i++) {
            find(adj, i, i, new boolean[n]);
        }
        return ans;
    }
}