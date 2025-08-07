// Last updated: 8/7/2025, 2:58:47 PM
class Solution {
    static int dp[];

    public int minCut(String s) {
        dp = new int[s.length()];
        Arrays.fill(dp, -1);
        return find(s, 0);
    }

    private static int find(String s, int idx) {
        if (s.length() == 0)
            return -1;
        if (dp[idx] != -1)
            return dp[idx];
        int ans = Integer.MAX_VALUE;
        //System.out.println(s);
        for (int i = 1; i <= s.length(); i++) {
            if (isPalindrom(s.substring(0, i))) {
                ans = Math.min(ans, find(s.substring(i), idx + i));
            }
        }
        // System.out.println("end "+s+" "+ans);
        return dp[idx] = ans == Integer.MAX_VALUE ? ans : ans + 1;
    }

    private static boolean isPalindrom(String s) {
        if (s.length() == 1)
            return true;
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}