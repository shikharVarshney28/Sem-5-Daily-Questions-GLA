// Last updated: 8/7/2025, 2:43:46 PM
class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int max = Math.abs(nums[0] - nums[nums.length - 1]);
        for (int i = 1; i < nums.length - 1; i++) {
            max = Math.max(max, Math.max(Math.abs(nums[i] - nums[i - 1]), Math.abs(nums[i] - nums[i + 1])));
        }
        return max;
    }
}