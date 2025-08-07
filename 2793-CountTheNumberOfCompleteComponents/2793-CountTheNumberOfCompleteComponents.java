// Last updated: 8/7/2025, 2:46:08 PM
class Solution {
    public int countCompleteComponents(int n, int[][] edges) {
        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }
        int cost[] = new int[n];
        for (int edge[] : edges) {
            adjList.get(edge[0]).add(edge[1]);
            adjList.get(edge[1]).add(edge[0]);
            cost[edge[0]]++;
            cost[edge[1]]++;
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (cost[i] == 0)
                ans++; // these are single nodes
        }
        for (int i = 0; i < n; i++) {
            if (cost[i] != 0) {
                int res[] = cycleThere(n, adjList, cost, i);
                // System.out.println(res[0]+" "+res[1]);
                if (((res[0] * (res[0] - 1)) / 2) == res[1]) {

                    ans++;
                }
            }
        }
        return ans;
    }

    int[] cycleThere(int n, List<List<Integer>> adjList, int cost[], int src) {
        Queue<Integer> qu = new LinkedList<>();
        qu.add(src);
        int nodes = 1, edges = 0;
        while (qu.size() > 0) {
            int r = qu.poll();
            // Now remove the edges
            if (cost[r] == 0)
                continue;
            for (int neigh : adjList.get(r)) {
                if (cost[neigh] == 0)
                    continue;
                cost[r]--;
                cost[neigh]--;
                edges++;
                if (!qu.contains(neigh)) {
                    nodes++;

                    qu.add(neigh);
                    // System.out.println (qu+" "+edges+" ");
                }
            }
            // return new int[] { nodes, edges };
        }
        return new int[] { nodes, edges };
    }

}