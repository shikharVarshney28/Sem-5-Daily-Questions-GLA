// Last updated: 8/7/2025, 3:00:12 PM
class Solution {
    int dp[];

    boolean find(int nums[], int idx) {
        if (idx == nums.length - 1)
            return true;
        if (idx > nums.length)
            return false;
        if (dp[idx] != 0)
            return dp[idx] == 1;
        boolean f = false;
        for (int i = 1; i <= nums[idx] && !f; i++) {
            f = f || find(nums, idx + i);
        }
        dp[idx] = f ? 1 : -1;
        return f;
    }

    public boolean canJump(int[] nums) {
        dp = new int[nums.length];
        return find(nums, 0);
    }
}