// Last updated: 8/7/2025, 2:53:12 PM
class Solution {
    int dp[][];

    public int findPath(int src, int n, int[][] cost, int m) {
        //if (m == Math.pow(2, n) - 1)
        //  return 0;
        int min = Integer.MAX_VALUE;
        if (dp[src][m] != -1)
            return dp[src][m];
        for (int i = 0; i < n; i++) {
            if ((m | (1 << i)) == m)
                continue;
            int ans = findPath(i, n, cost, m | (1 << i)) + cost[src][i];
            min = Math.min(min, ans);
        }
        if (min == Integer.MAX_VALUE)
            return dp[src][m] = 0;
        return dp[src][m] = min;
    }

    public int shortestPathLength(int[][] graph) {
        int[][] arr = new int[graph.length][graph.length];
        int n = graph.length;
        dp = new int[n][(int) Math.pow(2, n)];
        for (int i[] : dp) {
            Arrays.fill(i, -1);
        }
        for (int i[] : arr) {
            Arrays.fill(i, 14);
        }
        for (int i = 0; i < n; i++) {
            arr[i][i] = 0;
            for (int j = 0; j < graph[i].length; j++) {
                int to = graph[i][j];
                arr[i][to] = arr[to][i] = 1;
            }
        }
        //Flyod Warsher algo
        for (int via = 0; via < n; via++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    arr[i][j] = Math.min(arr[i][j], arr[i][via] + arr[via][j]);
                }
            }
        }
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            ans = Math.min(ans, findPath(i, n, arr, 1 << i));
        }
        /*for(int i[]:arr){
            for(int j:i){
                System.out.print(j+" ");
            }
            System.out.println ();
        }*/
        return ans;
    }
}