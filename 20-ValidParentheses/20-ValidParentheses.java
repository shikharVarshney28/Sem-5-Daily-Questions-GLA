// Last updated: 8/7/2025, 3:01:00 PM
import java.util.Stack;
class Solution {
    static boolean isbalanced(String s)
    {
        Stack <Character> st=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='(' || ch=='['|| ch=='{') st.push(ch);
            else
            {
                if(st.size()==0) return false;
                if((ch==')' && st.peek()=='(') || (ch==']' && st.peek()=='[') || (ch=='}' && st.peek()=='{')) st.pop();
                else return false;
                
            }
        }
        if (st.size()==0) return true;
        return false;
    }
    public boolean isValid(String s) {
       return isbalanced(s);
    }
}