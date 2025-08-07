// Last updated: 8/7/2025, 2:57:32 PM
class Solution {
    int dp1[];
    int dp2[];

    int find(int[] nums, int st, int end, int d[]) {
        if (st < end)
            return 0;
        if (d[st] != -1)
            return d[st];
        return d[st] = Math.max(find(nums, st - 1, end, d),
                find(nums, st - 2, end, d) + nums[st]);
    }

    public int rob(int[] nums) {
        if (nums.length == 1)
            return nums[0];
        dp1 = new int[nums.length];
        dp2 = new int[nums.length];
        Arrays.fill(dp1, -1);
        Arrays.fill(dp2, -1);
        return Math.max(find(nums, nums.length - 1, 1, dp1), find(nums, nums.length - 2, 0, dp2));
    }

}