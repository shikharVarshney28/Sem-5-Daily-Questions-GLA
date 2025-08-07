// Last updated: 8/7/2025, 2:44:08 PM
class Solution {
    public int possibleStringCount(String word) {
        Stack<Character> st = new Stack<>();
        int ans = 1;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (st.size() > 0 && st.peek() == ch)
                ans++;
            else
                st.push(ch);
        }
        return ans;
    }
}