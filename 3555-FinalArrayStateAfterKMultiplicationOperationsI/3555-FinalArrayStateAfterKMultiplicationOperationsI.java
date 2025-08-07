// Last updated: 8/7/2025, 2:44:20 PM
class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        TreeMap<Integer, Integer> t = new TreeMap<>();
        for (int i = 0; i < k; i++) {
            // find Minimum
            int idx = 0, min = Integer.MAX_VALUE;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] < min) {
                    idx = j;
                    min = nums[j];
                }
            }
            nums[idx] *= multiplier;
        }
        return nums;
    }
}