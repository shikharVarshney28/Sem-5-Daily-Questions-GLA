// Last updated: 8/7/2025, 3:00:31 PM
class Solution {
    int form(int[] nums, int idx,int[][]dp) {
        if (idx >= nums.length)
            return Integer.MAX_VALUE;
        if (idx == nums.length - 1)
            return 1;
            if(dp[nums[idx]][idx]!=0) return dp[nums[idx]][idx];
        int min = Integer.MAX_VALUE;
        for (int i = 1; i <= nums[idx]; i++) {
            min = Math.min(min, form(nums, idx + i,dp));
        }
        if (min == Integer.MAX_VALUE)
            return Integer.MAX_VALUE;
        return dp[nums[idx]][idx]=min + 1;
    }

    public int jump(int[] nums) {
        int [][] dp=new int[1001][nums.length];
        return form(nums, 0,dp) - 1;
    }
}