// Last updated: 8/19/2025, 4:59:17 PM
class Solution {
    public int xorAfterQueries(int[] nums, int[][] queries) {
        for (int j[] : queries) {
            int l = j[0], r = j[1], k = j[2], v = j[3];
            for (int i = l; i <= r;) {
                nums[i] = (int)(((long)nums[i] * v) % ((long)Math.pow(10, 9) + 7));
                i += k;
            }
        }
        int ans = nums[0];
        for (int i = 1; i < nums.length; i++)
            ans ^= nums[i];
        return ans;
    }
}