// Last updated: 8/7/2025, 2:54:21 PM
class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        return Math.max(nums[0]*nums[1]*nums[n-1],Math.max(nums[0] * nums[1] * nums[2], nums[n - 1] * nums[n - 2] * nums[n - 3]));
    }
}