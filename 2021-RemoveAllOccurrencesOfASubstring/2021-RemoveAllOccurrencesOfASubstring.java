// Last updated: 8/7/2025, 2:48:58 PM
class Solution {
    public String removeOccurrences(String s1, String part) {
        StringBuilder s = new StringBuilder(s1);
        int i = 0;
        while (i <= s.length() - part.length()) {
            String temp = s.substring(i, i + part.length());
            if (temp.equals(part)) {
                i--;
                s.delete(i + 1, i + part.length() + 1);
                i = -1;
            }
            i++;
        }
        return s.toString();
    }
}