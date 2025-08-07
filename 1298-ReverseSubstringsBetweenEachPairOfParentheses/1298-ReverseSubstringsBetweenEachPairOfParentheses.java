// Last updated: 8/7/2025, 2:51:52 PM
class Solution {
    public String reverseParentheses(String s) 
    {
        Stack<Integer> st=new Stack<>();
        char []ch=s.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]=='(') st.push(i);
            else if(ch[i]==')') reverse(ch,st.pop(),i);
        }
        StringBuilder res=new StringBuilder();
        for(int i=0;i<ch.length;i++)
            if(Character.isAlphabetic(ch[i])) res.append(ch[i]);
            
        return res.toString();
        
    }
    private void reverse(char[] s,int l,int r)
    {
        while(l<r)
        {
            char temp=s[l];
            s[l++]=s[r];
            s[r--]=temp;
        }
    }
}