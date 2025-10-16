// Last updated: 10/16/2025, 10:42:24 AM
class Solution {
    public int longestSubarray(int[] nums) {
        int a = -1, b = -1, i = 0, len = 0, ans = 0;
        for ( ; i < nums.length; i++) {
            if (a == -1) {
                a = nums[i];
                len++;
            } else if (b == -1) {
                b = nums[i];
                len++;
            } else {
                if (a + b == nums[i]) {
                    len++;
                } else {
                    ans = Math.max(ans, len);
                    len = 2;
                }
                a = b;
                b = nums[i];
            }
        }
        return Math.max(len, ans);
    }
}