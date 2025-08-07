// Last updated: 8/7/2025, 2:49:01 PM
class Solution {
    int ans = 0;

    void recur(int[] nums, int idx, int xor) {
        if (idx >= nums.length) {
            ans += xor;
            return;
        }
        ans += xor;
        for (int i = idx; i < nums.length; i++) {
            recur(nums, i + 1, xor ^ nums[i]);
        }
    }

    public int subsetXORSum(int[] nums) {
        recur(nums, 0, 0);
        return ans;
    }
}