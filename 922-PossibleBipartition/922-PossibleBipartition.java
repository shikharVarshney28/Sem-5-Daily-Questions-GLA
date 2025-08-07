// Last updated: 8/7/2025, 2:53:02 PM
class Solution {
    boolean dfs(List<List<Integer>> adjList, int src, int arr[], int c) {
        arr[src] = c;
        for (int i : adjList.get(src)) {
            if (arr[i] != 0 && arr[src] == arr[i])
                return false;
            if (arr[i] != 0)
                continue;
            if (!dfs(adjList, i, arr, -c))
                return false;
        }
        return true;
    }

    public boolean possibleBipartition(int n, int[][] dislikes) {
        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            adjList.add(new ArrayList<>());
        }
        for (int i[] : dislikes) {
            adjList.get(i[0]).add(i[1]);
            adjList.get(i[1]).add(i[0]);
        }
        int arr[] = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            if (arr[i] != 0)
                continue;
            if (!dfs(adjList, i, arr, 1))
                return false;
            ;
        }
        return true;
    }
}