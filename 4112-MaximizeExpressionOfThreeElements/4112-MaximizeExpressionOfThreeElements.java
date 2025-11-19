// Last updated: 11/19/2025, 12:33:11 PM
class Solution {
    public int maximizeExpressionOfThree(int[] nums) {
        Arrays.sort (nums);
        int n = nums.length;
        return -nums[0]+nums[n-1]+nums[n-2];
    }
}