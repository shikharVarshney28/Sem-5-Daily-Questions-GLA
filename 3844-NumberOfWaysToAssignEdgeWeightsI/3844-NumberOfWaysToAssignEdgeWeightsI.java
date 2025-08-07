// Last updated: 8/7/2025, 2:43:20 PM
class Solution {
    int dp[][];
    // if sum ==0 for any n means till yet sum is even otherwise some odd number is therether at particular n
    int mod = (int) (Math.pow(10, 9) + 7);

    int find(int n, int sum) {
        if (n == 0) {
            return (sum % 2 == 0) ? 0 : 1;
        }
        if (dp[n][sum] != -1)
            return dp[n][sum];
        return dp[n][sum] = (find(n - 1, (sum + 1) % 2) % mod +
                find(n - 1, (sum + 2) % 2) % mod) % mod;
    }

    int bfs(List<List<Integer>> adjList, int n) {
        Queue<int[]> qu = new LinkedList<>();
        qu.add(new int[] { 1, -1 });
        int level = -1;
        while (!qu.isEmpty()) {
            int size = qu.size();
            for (int i = 0; i < size; i++) {
                int t[] = qu.poll();
                for (int j : adjList.get(t[0])) {
                    if (j == t[1])
                        continue;
                    qu.add(new int[] { j, t[0] });
                }
            }
            level++;
        }
        return level;
    }

    public int assignEdgeWeights(int[][] edges) {
        List<List<Integer>> adjList = new ArrayList<>();
        int n = edges.length + 1;
        for (int i = 1; i <= n + 1; i++) {
            adjList.add(new ArrayList<>());
        }
        for (int i[] : edges) {
            adjList.get(i[0]).add(i[1]);
            adjList.get(i[1]).add(i[0]);
        }
        int edgeLength = bfs(adjList, n);
        System.out.println(edgeLength);
        dp = new int[edges.length + 1][2];
        for (int i[] : dp) {
            Arrays.fill(i, -1);
        }
        return find(edgeLength, 0);
    }
}