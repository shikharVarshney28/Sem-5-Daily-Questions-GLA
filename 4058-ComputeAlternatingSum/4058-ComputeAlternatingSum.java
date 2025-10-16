// Last updated: 10/16/2025, 10:42:19 AM
class Solution {
    public int alternatingSum(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + (i % 2 == 0 ? nums[i] : -nums[i]);
        }
        return sum;
    }
}