// Last updated: 8/7/2025, 2:51:59 PM
class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int dp[][] = new int[text1.length() +1][text2.length() +1];
        for (int i = 1; i < text1.length() +1; i++) {
            for (int j = 1; j < text2.length() +1; j++) {
                if (text1.charAt(i -1) == text2.charAt(j -1))
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[text1.length()][text2.length() ];
        // return bottomUp(text1, text2, text1.length() - 1, text2.length() - 1, dp);
    }
}
