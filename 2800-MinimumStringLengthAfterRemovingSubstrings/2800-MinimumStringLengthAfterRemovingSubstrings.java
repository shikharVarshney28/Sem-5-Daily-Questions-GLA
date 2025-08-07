// Last updated: 8/7/2025, 2:46:07 PM
class Solution {
    public int minLength(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(st.size()==0) st.push(ch);
            else{
                if(st.peek()=='A' && ch=='B') st.pop();
                else if(st.peek()=='C' && ch=='D') st.pop();
                else st.push(ch);
            }
        }
        return st.size();
    }
}