// Last updated: 8/7/2025, 2:56:18 PM
class Solution {
    int find(int n, int ans[]) {
        int len = Integer.toBinaryString(n).length() - 1;
        return 1 + ans[(int) (n - Math.pow(2, len))];
    }

    public int[] countBits(int n) {
        if(n==0) return new int[1];
        int ans[] = new int[n + 1];
        int len = Integer.toBinaryString(n).length() - 1;
        for (int i = 0; i <= len; i++) {
            ans[(int) Math.pow(2, i)] = 1;
        }
        for (int i = 3; i <= n; i++) {
            if (ans[i] != 1) {
                ans[i] = find(i, ans);
            }
        }
        return ans;
    }
}