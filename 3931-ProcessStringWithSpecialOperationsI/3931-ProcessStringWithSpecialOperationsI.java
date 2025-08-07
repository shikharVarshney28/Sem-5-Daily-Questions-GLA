// Last updated: 8/7/2025, 2:42:55 PM
class Solution {
    public String processStr(String s) {
        StringBuilder ans = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (ch >= 'a' && ch <= 'z')
                ans.append(ch);
            else if (ch == '*') {
                if (ans.length() >= 1) {
                    ans.deleteCharAt(ans.length() - 1);
                }
            } else if (ch == '#')
                ans.append(ans);
            else
                ans.reverse();
        }
        return ans.toString();
    }
}