// Last updated: 8/7/2025, 2:43:54 PM
class Solution {
    public int countPartitions(int[] nums) {
        int count = 0;
        int left = 0, right = 0;
        for (int i : nums)
            right += i;
        for (int i = 0; i < nums.length; i++) {
            left += nums[i];
            right -= nums[i];
            if ((left - right) % 2 == 0)
                count++;
        }
        return count != 0 ? count - 1 : 0;
    }
}