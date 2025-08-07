// Last updated: 8/7/2025, 3:00:57 PM
class Solution {
    void form(int n, StringBuilder s, int open, int close, List<String> ans) {
        if (open < close || open>n)
            return;
        if (s.length() == 2 * n) {
            if (open == close)
                ans.add(s.toString());
            return;
        }
        form(n, s.append('('), open + 1, close, ans);
        s.deleteCharAt(s.length()-1);
        form(n, s.append(')'), open, close + 1, ans);
        s.deleteCharAt(s.length()-1);
    }

    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        form(n, new StringBuilder("("), 1, 0, ans);
        return ans;
    }
}