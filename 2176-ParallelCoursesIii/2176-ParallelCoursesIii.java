// Last updated: 8/7/2025, 2:48:29 PM
class Solution {
    int find(PriorityQueue<int[]> pq, List<List<Integer>> adjList, int[] incoming, int[] time) {
        int maxMonth = 0;
        while (pq.size() > 0) {
            int t[] = pq.poll();
            maxMonth = Math.max(maxMonth, t[1]);
            for (int i : adjList.get(t[0])) {
                incoming[i]--;
                if (incoming[i] == 0)
                    pq.add(new int[] { i, time[i - 1] + t[1] });
            }
        }
        return maxMonth;
    }

    public int minimumTime(int n, int[][] relations, int[] time) {
        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            adjList.add(new ArrayList<>());
        }
        int indegree[] = new int[n + 1];
        for (int i[] : relations) {
            adjList.get(i[0]).add(i[1]);
            indegree[i[1]]++;
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);
        for (int i = 1; i <= n; i++) {
            if (indegree[i] == 0) {
                pq.add(new int[] { i, time[i - 1] });
            }
        }
        return find(pq, adjList, indegree, time);
    }
}