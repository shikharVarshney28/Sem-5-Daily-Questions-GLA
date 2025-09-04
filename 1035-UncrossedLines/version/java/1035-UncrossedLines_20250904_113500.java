// Last updated: 9/4/2025, 11:35:00 AM
class Solution {
    public int maxUncrossedLines(int[] s, int[] t) {
        int dp[][] = new int[s.length + 1][t.length + 1];
        for (int i = 1; i <= s.length; i++) {
            for (int j = 1; j <= t.length; j++) {
                if (s[i - 1] == t[j - 1])
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                else
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
            }
        }
        return dp[dp.length - 1][dp[0].length - 1];
    }
}