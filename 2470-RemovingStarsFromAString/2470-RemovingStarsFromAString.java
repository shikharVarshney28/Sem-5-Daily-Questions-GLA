// Last updated: 8/7/2025, 2:47:28 PM
class Solution {
    public String removeStars(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(st.size()!=0 && ch=='*') st.pop();
            else st.push(ch);
        }
        String ans="";
        while(st.size()!=0)
        {
            ans=st.pop()+ans;
        }
        return ans;
    }
}