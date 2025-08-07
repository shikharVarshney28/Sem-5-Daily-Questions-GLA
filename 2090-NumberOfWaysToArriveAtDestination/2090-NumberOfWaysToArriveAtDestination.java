// Last updated: 8/7/2025, 2:48:48 PM
class Solution {
    static int mod = (int) Math.pow(10, 9) + 7;
    static int cnt = 0;

    public int countPaths(int n, int[][] roads) {
        List<List<int[]>> adjList = new ArrayList<>();
        for (int i = 0; i < n; i++)
            adjList.add(new ArrayList<>());
        for (int road[] : roads) {
            adjList.get(road[0]).add(new int[] { road[1], road[2] });
            adjList.get(road[1]).add(new int[] { road[0], road[2] });
        }
        long cost[] = new long[n];
        Arrays.fill(cost, Long.MAX_VALUE);
        cost[0] = 0;
        long pathCnt[] = new long[n];
        pathCnt[0] = 1;
        dikastrasAlgo(adjList, n, 0, cost, pathCnt);
        return (int) pathCnt[n - 1];
    }

    private static void dikastrasAlgo(List<List<int[]>> adjList, int n, int src, long[] cost, long pathCnt[]) {
        PriorityQueue<long[]> pq = new PriorityQueue<>(Comparator.comparingLong(a -> a[1]));
        pq.add(new long[] { 0, 0 });
        while (!pq.isEmpty()) {
            long nsrc[] = pq.poll();
            int u = (int) nsrc[0]; // 0 to n-1
            if (cost[u] < nsrc[1])
                continue;
            for (int i[] : adjList.get(u)) {
                if (cost[u] + i[1] < cost[i[0]]) {
                    cost[i[0]] = cost[u] + i[1];
                    pathCnt[i[0]] = pathCnt[u];
                    pq.add(new long[] { i[0], cost[i[0]] });
                } else if (cost[u] + i[1] == cost[i[0]]) {
                    pathCnt[i[0]] = (pathCnt[i[0]] + pathCnt[u]) % mod;
                }
            }
        }
    }
}