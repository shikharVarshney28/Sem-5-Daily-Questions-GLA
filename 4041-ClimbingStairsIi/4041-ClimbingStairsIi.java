// Last updated: 10/16/2025, 10:42:14 AM
class Solution {
    Integer[] dp;
    // costs[j] + (j - i)2 in my code its find() + number
    int find(int n, int costs[], int idx) {
        if (n == idx) {
            return costs[idx - 1];
        }
        if (n < idx) {
            return 10001;
        }
        if (dp[idx] != null)
            return dp[idx];
        return dp[idx] = Math.min(find(n, costs, idx + 1) + 1,
                Math.min(find(n, costs, idx + 2) + 4,
                        find(n, costs, idx + 3) + 9))
                + (idx - 1 >= 0 ? costs[idx - 1] : 0);
    }

    public int climbStairs(int n, int[] costs) {
        dp = new Integer[n + 1];
        return find(n, costs, 0);
    }
}