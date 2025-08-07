// Last updated: 8/7/2025, 2:59:27 PM
class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        if (s1.length() + s2.length() != s3.length())
            return false;
        int dp[][][] = new int[s1.length() + 1][s2.length() + 1][s3.length() + 1];
        return (interleavingString(s1, s2, s3, s1.length() - 1, s2.length() - 1, s3.length() - 1, dp));
    }

    private static boolean interleavingString(String s1, String s2, String s3, int i, int j, int k, int dp[][][]) {
        if (k < 0)
            return true;
        if (i >= 0 && j >= 0 && s1.charAt(i) == s3.charAt(k) && s2.charAt(j) == s3.charAt(k)) {
            return (interleavingString(s1, s2, s3, i - 1, j, k - 1, dp)
                    || interleavingString(s1, s2, s3, i, j - 1, k - 1, dp));
        }
        if (i >= 0 && s1.charAt(i) == s3.charAt(k)) {
            return interleavingString(s1, s2, s3, i - 1, j, k - 1, dp);
        }
        if (j >= 0 && s2.charAt(j) == s3.charAt(k)) {
            return interleavingString(s1, s2, s3, i, j - 1, k - 1, dp);
        }
        return false;
    }
}