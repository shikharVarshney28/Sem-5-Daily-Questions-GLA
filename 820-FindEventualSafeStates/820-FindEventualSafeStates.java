// Last updated: 8/7/2025, 2:53:27 PM
class Solution {
    HashSet<Integer> ans;
    int isNodeSafe[];

    boolean find(int src, int[][] graph) {
        boolean f = true;
        isNodeSafe[src] = 2; // vis
        for (int i : graph[src]) {
            if (isNodeSafe[i] == 1)
                continue;
            if (isNodeSafe[i] == 2 || isNodeSafe[i] == -1) {
                isNodeSafe[i] = -1;
                return false;
            }
            f = find(i, graph);
            if (!f) {
                isNodeSafe[src] = -1;
                return false;
            }
        }
        isNodeSafe[src] = 1;
        return true;
    }

    public List<Integer> eventualSafeNodes(int[][] graph) {
        ans = new HashSet<>();
        isNodeSafe = new int[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (graph[i].length == 0) {
                isNodeSafe[i] = 1;
            }
        }
        for (int i = 0; i < graph.length; i++) {
            if (isNodeSafe[i] == 1)
                ans.add(i);
            else if (isNodeSafe[i] == 0 && find(i, graph))
                ans.add(i);
        }

        List<Integer> res = new ArrayList<>(ans);
        Collections.sort(res);
        return res;
    }
}