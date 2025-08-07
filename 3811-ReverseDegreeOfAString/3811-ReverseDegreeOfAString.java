// Last updated: 8/7/2025, 2:43:31 PM
class Solution {
    public int reverseDegree(String s) {
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            int num = (26 - (s.charAt(i) - 'a')) * (i + 1);
            ans += num;
        }
        return ans;
    }
}