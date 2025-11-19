// Last updated: 11/19/2025, 12:33:16 PM
class Solution {
    public long maxAlternatingSum(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] *= nums[i];
        }
        Arrays.sort(nums);
        int st = 0, end = nums.length - 1;
        long ans = 0;
        while (st < end) {
            ans += nums[end--] - nums[st++];
        }
        if (st == end)
            ans += nums[st];
        return ans;
    }
}