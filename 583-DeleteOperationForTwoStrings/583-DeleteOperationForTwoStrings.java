// Last updated: 8/7/2025, 2:54:30 PM
class Solution {
    int dp[][];

    public int minDistance(String word1, String word2) {
        dp = new int[word1.length()][word2.length()];
        for (int i[] : dp) {
            Arrays.fill(i, -1);
        }
        return solve(word1, word2, word1.length() - 1, word2.length() - 1);
    }

    int solve(String s, String t, int i, int j) {
        if (i < 0 && j < 0)
            return 0;
        if (i < 0)
            return j + 1;
        if (j < 0)
            return i + 1;
        if (dp[i][j] != -1)
            return dp[i][j];
        if (s.charAt(i) == t.charAt(j)) {
            return dp[i][j] = solve(s, t, i - 1, j - 1); // lets check for next character
        } else {
            // we need to delete the character either from s or t and which is n
            return dp[i][j] = Math.min(solve(s, t, i - 1, j), solve(s, t, i, j - 1)) + 1;
        }
    }
}