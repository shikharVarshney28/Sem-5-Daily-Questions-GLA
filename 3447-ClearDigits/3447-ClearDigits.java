// Last updated: 8/7/2025, 2:44:46 PM
class Solution {
    public String clearDigits(String s) {
        Stack<Character> st=new Stack<>();
        StringBuilder  temp=new StringBuilder ();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(st.size()==0 || (ch>='a' && ch<='z')) st.push(ch);
            else if(ch>='0' && ch<='9' && st.size()!=0) st.pop();
        }
        while(st.size()!=0)
            temp=temp.insert(0,st.pop());
        return temp.toString();
    }
}