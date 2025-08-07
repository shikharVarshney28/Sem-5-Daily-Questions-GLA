// Last updated: 8/7/2025, 2:49:04 PM
class Solution {
    public int largestPathValue(String colors, int[][] edges) {
        int n = colors.length();
        int inDegree[] = new int[n];
        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }
        int nodeColorTable[][] = new int[n][26];
        for (int i[] : edges) {
            adjList.get(i[0]).add(i[1]);
            inDegree[i[1]]++;
        }
        Queue<Integer> qu = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (inDegree[i] == 0) {
                qu.add(i);
                nodeColorTable[i][colors.charAt(i) - 'a'] = 1;
            }
        }
        int nodes = 0;
        while (!qu.isEmpty()) {
            int src = qu.poll();
            nodes++;
            for (int i : adjList.get(src)) {
                //update the table for this node i wrt to src
                for (int c = 0; c < 26; c++) {
                    nodeColorTable[i][c] = Math.max(nodeColorTable[i][c],
                            nodeColorTable[src][c] + ((colors.charAt(i) - 'a') == c ? 1 : 0));
                }
                inDegree[i]--;
                if (inDegree[i] == 0)
                    qu.add(i);
            }
        }
        if (nodes < n)
            return -1;
        int ans = 0;
        for (int i[] : nodeColorTable) {
            for (int j : i) {
                ans = Math.max(ans, j);
            }
        }
        return ans;
    }
}