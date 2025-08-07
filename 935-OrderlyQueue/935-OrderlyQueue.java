// Last updated: 8/7/2025, 2:52:58 PM
class Solution {
    public String orderlyQueue(String s, int k) {
        StringBuilder t = new StringBuilder(s);
        StringBuilder ans = new StringBuilder();
        int n = s.length();
        if (k == 1) {
            for (int i = 0; i < n; i++) {
                t.append(t.charAt(0));
                t.deleteCharAt(0);
                if (ans.length() == 0 || t.compareTo(ans) < 0) {
                    ans = new StringBuilder(t);
                }
            }
            return ans.toString();
        }
        String[] ch = s.split("");
        Arrays.sort(ch);
        t = new StringBuilder();
        for (int i = 0; i < n; i++)
            t.append(ch[i]);
        return t.toString();
    }
}