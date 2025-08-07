// Last updated: 8/7/2025, 2:48:10 PM
class Solution {
    public long mostPoints(int[][] questions) {
        int n = questions.length;

        long[] dp = new long[n];
        Arrays.fill(dp, -1);

        return res(0, questions, dp, n);
    }

    private long res(int i, int[][] questions, long[] dp, int n) {
        if (i >= n)
            return 0;
        if (dp[i] != -1)
            return dp[i];

        long take = questions[i][0] + res((i + questions[i][1] + 1), questions, dp, n);
        long skip = res((i + 1), questions, dp, n);

        dp[i] = Math.max(take, skip);
        return dp[i];
    }

}