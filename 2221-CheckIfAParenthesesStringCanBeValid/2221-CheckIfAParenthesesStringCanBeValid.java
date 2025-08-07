// Last updated: 8/7/2025, 2:48:18 PM
class Solution {
    public boolean canBeValid(String s, String locked) {
        if (s.length() % 2 != 0)
            return false;
        Stack<Integer> st = new Stack<>();
        Stack<Integer> track = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            char l = locked.charAt(i);
            if (l == '0') {
                // means this char can be changed
                track.push(i);
            } else if (ch == '(') {
                // this is locked char and can form valid parenthesis adter
                st.push(i);
            } else {
                // locked && ) char and wwe need to balance it
                // Way 1 : kya koi open parenthesis aaya hai so wen neednt to flip...?
                if (!st.isEmpty())
                    st.pop();
                // Way 2 to flip the unlocked parenthesis
                else if (!track.isEmpty())
                    track.pop();
                // then simply
                else
                    return false;

            }
        }
        while (st.size() > 0 && track.size() > 0 && st.peek() < track.peek()) {
            st.pop();
            track.pop();
        }
        return st.isEmpty();
    }
}