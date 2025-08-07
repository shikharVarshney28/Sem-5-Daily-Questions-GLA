// Last updated: 8/7/2025, 2:48:45 PM
class Solution {
    // Union Finding 
    void find(List<List<Integer>> adjList, int arr[], int src, int parent) {
        arr[src] = parent;
        for (int i : adjList.get(src)) {
            if (arr[i] != -1)
                continue;
            find(adjList, arr, i, parent);
        }
    }

    public boolean validPath(int n, int[][] edges, int source, int destination) {
        int src[] = new int[n];
        Arrays.fill(src, -1);
        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }
        for (int i[] : edges) {
            adjList.get(i[0]).add(i[1]);
            adjList.get(i[1]).add(i[0]);
        }
        for (int i = 0; i < n; i++) {
            if (src[i] != -1)
                continue;
            find(adjList, src, i, i);
        }
        return src[source] == src[destination];
    }
}