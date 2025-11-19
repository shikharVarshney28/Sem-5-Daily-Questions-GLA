// Last updated: 11/19/2025, 12:33:14 PM
class Solution {
    public int minLengthAfterRemovals(String s) {
        Stack <Character > st = new Stack <>();
        for(char ch: s.toCharArray ()){
            if(st.size()==0||st.peek ()==ch) st.push (ch);
            else {
                if(st.size ()>0) st.pop();
            }       
        }
        return st.size ();
    }
}