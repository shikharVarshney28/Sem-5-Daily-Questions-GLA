// Last updated: 8/7/2025, 2:49:40 PM
class Solution {
    public String interpret(String command) {
        Stack<String> st=new Stack<>();
        for(int i=0;i<command.length();i++)
        {
            char ch=command.charAt(i);
            if(st.size()==0 || ch>='a' && ch<='z' || ch>='A' && ch<='Z') st.push(""+ch);
            else if(st.peek().equals("(") && ch==')'){
                st.pop();
                st.push("o");
            }
            else if(ch==')'){
                String temp="";
                while(!st.peek().equals("(")){
                    temp=st.pop()+temp;
                }
                st.pop();
                st.push(temp);
            }
            else st.push(""+ch);
            System.out.println(st);
        }
        String ans="";
        while(st.size()>0){
            ans=st.pop()+ans;
        }
        return ans;
    }
}