// Last updated: 8/7/2025, 2:43:41 PM
class Solution {
    public int[] transformArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (nums[i] % 2 == 0) ? 0 : 1;
        }
        Arrays.sort (nums);
        return nums;
    }
}