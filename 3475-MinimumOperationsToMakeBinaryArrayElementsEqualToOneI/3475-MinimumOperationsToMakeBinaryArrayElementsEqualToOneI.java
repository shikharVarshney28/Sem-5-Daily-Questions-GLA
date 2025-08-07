// Last updated: 8/7/2025, 2:44:36 PM
class Solution {
    public int minOperations(int[] nums) {
        int ans = 0, i = 0;
        for (; i < nums.length - 2; i++) {
            if (nums[i] == 0) {
                nums[i] = 1 - nums[i];
                nums[i + 1] = 1 - nums[i + 1];
                nums[i + 2] = 1 - nums[i + 2];
                ans++;
            }
        }
        // now check whether any of lst 2 lee are zero
        if (nums[i] == 0 || nums[i + 1] == 0) {
            return -1;
        }
        return ans;
    }
}