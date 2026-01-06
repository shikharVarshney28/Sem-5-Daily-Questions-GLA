// Last updated: 1/6/2026, 11:22:26 AM
1class Solution {
2    Integer[][] dp;
3
4    int find(int nums[], int idx, int p) {
5        if (idx >= nums.length)
6            return 0;
7        if (dp[idx][p] != null)
8            return dp[idx][p];
9        int ans = 0;
10        for (int i = idx; i < nums.length; i++) {
11            if (p == 5001) {
12                //buy any stock 
13                ans = Math.max(ans, find(nums, i + 1, i));
14            } else {
15                //sell stocks
16                ans = Math.max(ans, find(nums, i + 2, 5001) + (nums[i] - nums[p]));
17            }
18        }
19        
20        return dp[idx][p]=ans;
21    }
22
23    public int maxProfit(int[] prices) {
24        dp = new Integer[prices.length][5002];
25        return find(prices, 0, 5001);
26    }
27}