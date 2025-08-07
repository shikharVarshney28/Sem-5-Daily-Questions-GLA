// Last updated: 8/7/2025, 2:55:22 PM
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(s);
        Arrays.sort(g);
        int ans = 0;
        int i = g.length - 1, j = s.length - 1;
        while (i >= 0 && j >= 0) {
            if (g[i] > s[j])
                i--;
            else {
                ans++;
                i--;
                j--;
            }
        }
        return ans;
    }
}