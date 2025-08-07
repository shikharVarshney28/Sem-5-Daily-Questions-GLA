// Last updated: 8/7/2025, 2:54:39 PM
class Solution {
    public boolean checkRecord(String s) {
        int na = 0, nl = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'P')
                nl = 0;
            else if (s.charAt(i) == 'A') {
                na++;
                if (na >= 2)
                    return false;
                nl = 0;
            } else {
                nl++;
                if (nl == 3)
                    return false;
            }
        }
        return true;
    }
}