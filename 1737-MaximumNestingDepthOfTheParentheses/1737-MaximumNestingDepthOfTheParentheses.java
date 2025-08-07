// Last updated: 8/7/2025, 2:49:55 PM
class Solution {
    public int maxDepth(String s) {
        int net = 0, ans = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(')
                net++;
            if (s.charAt(i) == ')') {
                //depth of parenthesis is going to be dec...
                ans = Math.max(ans, net);
                net--;
            }
        }
        return Math.max(net, ans);
    }
}