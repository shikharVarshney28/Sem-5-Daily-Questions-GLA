// Last updated: 8/7/2025, 2:52:44 PM
class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> st = new Stack<>();
        int idx = 0;
        for (int i = 0; i <= pushed.length; i++) {
            while (st.size() > 0 && st.peek() == popped[idx]) {
                //Seeing if any peek ele is ready for being poping and so on..
                idx++;
                st.pop();
            }
            if (i < pushed.length)
                st.push(pushed[i]);
            //i<=pushed.length because we need to check after the last ele is pushed is ready to pop or not...
        }
        return st.isEmpty();
    }
}