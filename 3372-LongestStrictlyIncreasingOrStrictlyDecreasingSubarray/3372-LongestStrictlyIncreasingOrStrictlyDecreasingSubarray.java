// Last updated: 8/7/2025, 2:45:07 PM
class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        // find longest inc subarray first
        int maxIns = 0, i = 1, n = nums.length, num = nums[0], len = 1;
        while (i < n) {
            if (nums[i] > num) {
                len++;
                num = nums[i];
            } else {
                maxIns = Math.max(maxIns, len);
                num = nums[i];
                len = 1;
            }
            i++;
        }
        maxIns = Math.max(maxIns, len);
        int maxDes = 0;
        num = nums[0];
        i = 1;
        len = 1;
        // now find desc subarray
        while (i < n) {
            if (nums[i] < num) {
                len++;
                num = nums[i];
            } else {
                maxDes = Math.max(maxDes, len);
                num = nums[i];
                len = 1;
            }
            i++;
        }
        maxDes = Math.max(maxDes, len);

        return Math.max(maxDes, maxIns);
    }
}