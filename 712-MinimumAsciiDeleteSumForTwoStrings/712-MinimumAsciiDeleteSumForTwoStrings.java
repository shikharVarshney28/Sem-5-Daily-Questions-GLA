// Last updated: 8/7/2025, 2:54:04 PM
class Solution {
    int dp[][];

    int find(String s, String t, int i, int j) {
        if (i < 0 && j < 0) {
            return 0;
        }
        if (i < 0) {
            int sum = 0;
            for (int k = j; k >= 0; k--)
                sum += (int) (t.charAt(k));
            return sum;
        }
        if (j < 0) {
            int sum = 0;
            for (int k = i; k >= 0; k--)
                sum += s.charAt(k);
            return sum;
        }
        if (dp[i][j] != -1)
            return dp[i][j];
        if (s.charAt(i) == t.charAt(j)) {
            return dp[i][j] = find(s, t, i - 1, j - 1);
        }
        return dp[i][j] = Math.min(find(s, t, i - 1, j) + (int) (s.charAt(i)),
                find(s, t, i, j - 1) + (int) (t.charAt(j)));
    }

    public int minimumDeleteSum(String s1, String s2) {
        dp = new int[s1.length()][s2.length()];
        for (int i[] : dp) {
            Arrays.fill(i, -1);
        }
        return find(s1, s2, s1.length() - 1, s2.length() - 1);
    }
}