// Last updated: 8/7/2025, 2:48:31 PM
class Solution {
    int max = -1, cnt = 0;

    void find(int nums[], int idx, int mask) {
        for (int i = idx; i < nums.length; i++) {
            if ((mask | nums[i]) > max) {
                max = mask | nums[i];
                cnt = 1;
            } else if ((mask | nums[i]) == max)
                cnt++;
            find(nums, i + 1, mask | nums[i]);
        }
    }

    public int countMaxOrSubsets(int[] nums) {
        find(nums, 0, 0);
        return cnt;
    }
}