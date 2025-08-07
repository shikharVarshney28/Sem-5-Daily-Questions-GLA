// Last updated: 8/7/2025, 2:56:45 PM
class Solution {
    int dp[];

    int find(int n) {
        if (n == 0)
            return 0;
        if (n < 0)
            return Integer.MAX_VALUE;
        if (dp[n] != -1)
            return dp[n];
        int min = Integer.MAX_VALUE;
        for (int i = 1; i <= Math.floor(Math.sqrt(n)); i++) {
            if (i * i <= n)
                min = Math.min(min, find(n - i * i));
        }
        return dp[n] = min == Integer.MAX_VALUE ? min : min + 1;
    }

    public int numSquares(int n) {
        dp = new int[n + 1];
        Arrays.fill(dp, -1);
        return find(n);
    }
}