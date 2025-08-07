// Last updated: 8/7/2025, 2:53:14 PM
class Solution {
    Stack<Character> compare(String s)
    {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch>='a' && ch<='z') st.push(ch);
            else if(st.size()!=0 && ch=='#')st.pop();
        }
        return st;
    }
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> ss=compare(s);
        Stack<Character> ts=compare(t);
        return ss.equals(ts);
    }
}