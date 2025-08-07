// Last updated: 8/7/2025, 2:59:52 PM
class Solution {
    int find(String s, String t, int i, int j, int dp[][]) {
        if (i == 0)
            return j ;
        if (j == 0)
            return i ;
        if (dp[i][j] != -1)
            return dp[i][j];
        if (s.charAt(i - 1) == t.charAt(j - 1))
            return dp[i][j] = find(s, t, i - 1, j - 1, dp);
        return dp[i][j] = 1
                + Math.min(find(s, t, i - 1, j, dp), Math.min(find(s, t, i - 1, j - 1, dp), find(s, t, i, j - 1, dp)));
    }

    public int minDistance(String word1, String word2) {
        int m = word1.length(), n = word2.length();
        int dp[][] = new int[m+1][n+1];
        for (int i = 0; i <= m; i++)
            Arrays.fill(dp[i], -1);
        return find(word1, word2, m, n, dp);
    }
}