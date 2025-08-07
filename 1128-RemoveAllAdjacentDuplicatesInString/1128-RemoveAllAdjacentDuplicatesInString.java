// Last updated: 8/7/2025, 2:52:13 PM
class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(st.size()==0 || st.peek()!=ch) st.push(ch);
            else if(st.peek()==ch) st.pop();
        }
        String ans="";
        while(!st.isEmpty()){
            ans=st.pop()+ans;
        }
        return ans;
    }
}