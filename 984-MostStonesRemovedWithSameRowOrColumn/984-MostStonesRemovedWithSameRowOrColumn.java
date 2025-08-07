// Last updated: 8/7/2025, 2:52:42 PM
class Solution {
    void dfs(int source, ArrayList<ArrayList<Integer>> adjList, boolean isVisisted[]) {
        isVisisted[source] = true;
        for (int neighbour : adjList.get(source)) {
            if (!isVisisted[neighbour]) {
                dfs(neighbour, adjList, isVisisted);
            }
        }
    }

    public int removeStones(int[][] stones) {
        int n = stones.length;
        boolean isVisisted[] = new boolean[n];
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < n; i++)
            adjList.add(new ArrayList<>());
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j)
                    continue;
                if (stones[i][0] == stones[j][0] || stones[i][1] == stones[j][1]) {
                    adjList.get(i).add(j);
                    // adjList.get(j).add(i);
                }
            }
        }
        int noOfComponents = 0;
        for (int i = 0; i < n; i++) {
            if (!isVisisted[i]) {
                dfs(i, adjList, isVisisted);
                noOfComponents++;
            }
        }
        return n - noOfComponents;
    }
}