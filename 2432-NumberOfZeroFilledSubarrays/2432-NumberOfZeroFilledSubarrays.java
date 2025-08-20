// Last updated: 8/20/2025, 10:57:30 AM
class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long ans = 0;
        long streak = 0;
        for (int i = 0; i <= nums.length; i++) {
            if (i < nums.length && nums[i] == 0)
                streak++;
            else {
                if (streak != 0) {
                    ans += (streak) * (streak + 1) / 2;
                    streak = 0;
                }
            }
        }
        return ans;
    }
}