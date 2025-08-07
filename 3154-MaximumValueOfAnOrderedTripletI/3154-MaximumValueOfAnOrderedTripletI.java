// Last updated: 8/7/2025, 2:45:51 PM
class Solution {
    public long maximumTripletValue(int[] nums) {
        long ans = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    long val = (long)(nums[i] - nums[j]) * nums[k];
                    if (val < 0)
                        val = 0;
                    ans = Math.max(ans, val);
                }
            }
        }
        return ans;
    }
}