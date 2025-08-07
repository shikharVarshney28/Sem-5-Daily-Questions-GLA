// Last updated: 8/7/2025, 2:49:17 PM
class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;
        if (s1.equals(s2))
            return true;
        int count = 0, i = 0, j = 0;
        int n = s1.length();
        for (int p = 0; p < n; p++) {
            if (s1.charAt(p) != s2.charAt(p)) {
                count++;
                if (count > 2)
                    return false;
                if (count == 1)
                    i = p;
                else
                    j = p;
            }
        }
        return (s1.charAt(i) == s2.charAt(j) && s1.charAt(j) == s2.charAt(i));
    }
}