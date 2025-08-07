// Last updated: 8/7/2025, 3:00:39 PM
class Solution {
    public String countAndSay(int n) {
        String s = "1";
        for (int i = 2; i <= n; i++) {
            int idx = 1, cnt = 1;
            char ch = s.charAt(0);
            String temp = "";
            while (idx < s.length()) {
                if (s.charAt(idx) != ch) {
                    temp = temp + cnt + ch;
                    ch = s.charAt(idx);
                    cnt = 1;
                } else {
                    cnt++;
                }
                idx++;
            }
            temp = temp + cnt + ch;
            s = temp;
        }
        return s;
    }
}