// Last updated: 8/7/2025, 2:55:53 PM
class Solution {
    public String decodeString(String s) {
        Stack<String> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ']') {
                String t = "";
                while (!st.peek().equals("["))
                    t = st.pop() + t;
                st.pop(); //removed [
                int num = 0, pro = 1;
                while (st.size() > 0 && (st.peek().charAt(0)) >= '0' && (char) (st.peek().charAt(0)) <= '9') {
                    num = Integer.parseInt(st.pop()) * pro + num;
                    pro *= 10;
                }
                String ans = "";
                while (num-- > 0) {
                    ans += t;
                }

                st.push(ans);
            } else {
                st.push("" + s.charAt(i));
            }
        }
        String ans = "";
        while (st.size() > 0) {
            ans = st.pop() + ans;
        }
        return ans;
    }
}