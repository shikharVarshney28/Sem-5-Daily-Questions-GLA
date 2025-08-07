// Last updated: 8/7/2025, 2:47:10 PM
class Solution {
    public int longestSubarray(int[] nums) {
        int max = Arrays.stream(nums).max().getAsInt();
        int maxLen = 0, ans = 0;
        for (int i : nums) {
            if (i != max)
                maxLen = 0;
            else
                maxLen++;
            ans = Math.max(ans, maxLen);
        }
        return ans;
    }
}