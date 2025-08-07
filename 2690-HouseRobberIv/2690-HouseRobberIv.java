// Last updated: 8/7/2025, 2:46:30 PM
class Solution {
    public int minCapability(int[] nums, int k) {
        int st = Integer.MAX_VALUE, end = Integer.MIN_VALUE;
        for (int num : nums) {
            st = Math.min(st, num);
            end = Math.max(end, num);
        }
        int ans = 0;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (itsPossible(nums, k, mid)) {
                ans = mid;
                end = mid - 1;
            } else
                st = mid + 1;
        }
        return ans;
    }

    boolean itsPossible(int nums[], int k, int mid) {
        int n = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= mid) {
                n++;
                i++; // skip adjcent house as we robbed this house...
            }
            if (n >= k)
                return true;
        }
        return false;
    }
}