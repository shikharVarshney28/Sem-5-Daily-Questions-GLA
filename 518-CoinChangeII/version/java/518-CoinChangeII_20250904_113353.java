// Last updated: 9/4/2025, 11:33:53 AM
class Solution {
    Integer dp[][];
    int find(int coins[], int target, int idx) {
        if (target == 0)
            return 1;
        if(idx >= coins.length) return 0;
        if(dp[target][idx] != null) return dp[target][idx];
        int ans = 0;
        for (int i = idx; i < coins.length; i++) {
            if (target >= coins[i]) {
                // to find ways
                ans += find(coins, target - coins[i], i);
            }
        }
        return dp[target][idx]=ans;
    }

    public int change(int amount, int[] coins) {
        dp = new Integer[amount+1][coins.length];
        return find(coins, amount, 0);
    }
}