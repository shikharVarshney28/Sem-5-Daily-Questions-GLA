// Last updated: 8/7/2025, 2:47:52 PM
class Solution {
    public int waysToSplitArray(int[] nums) {
        int n = nums.length;
        long sum=0,left=0;
        for (int i = 0; i < n; i++)
            sum += nums[i];
        int validSpits = 0;
        for (int i = 0; i < n - 1; i++) {
            left += nums[i];
            if (left >= (sum - left))
                validSpits++;
        }
        return validSpits;
    }
}