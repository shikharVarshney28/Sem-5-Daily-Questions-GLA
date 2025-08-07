// Last updated: 8/7/2025, 2:44:33 PM
class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int left = 0, ans = 0, n = colors.length;
        for (int right = 1; right < n + k - 1; right++) {
            if (colors[(right - 1) % n] == colors[(right) % n]) {
                left = right;
            }
            if (right - left + 1 == k) {
                ans++;
                left++;
            }
        }
        return ans;
    }
}