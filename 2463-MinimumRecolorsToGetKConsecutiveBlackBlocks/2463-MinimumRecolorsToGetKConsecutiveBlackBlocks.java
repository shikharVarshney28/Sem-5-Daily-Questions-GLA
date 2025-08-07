// Last updated: 8/7/2025, 2:47:31 PM
class Solution {
    public int minimumRecolors(String blocks, int k) {
        int n = blocks.length();
        int white[] = new int[n];
        white[0] = blocks.charAt(0) == 'W' ? 1 : 0;
        for (int i = 1; i < n; i++) {
            white[i] = blocks.charAt(i) == 'W' ? white[i - 1] + 1 : white[i - 1];
        }
        int minOpr = white[k - 1];
        for (int i = 1; i <= n - k; i++) {
            minOpr = Math.min(minOpr, white[i + k - 1] - white[i - 1]);
        }
        return minOpr;
    }
}