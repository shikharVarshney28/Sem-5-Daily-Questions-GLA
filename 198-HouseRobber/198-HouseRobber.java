// Last updated: 8/7/2025, 2:57:47 PM
class Solution {
    int dp[];

    int find(int[] nums, int idx) {
        if (idx < 0)
            return 0;
        if (dp[idx] != -1)
            return dp[idx];
        return dp[idx] = Math.max(find(nums, idx - 1),
                find(nums, idx - 2) + nums[idx]);
    }

    public int rob(int[] nums) {
        dp = new int[nums.length];
        Arrays.fill (dp,-1);
        return find(nums, nums.length - 1);
    }
}