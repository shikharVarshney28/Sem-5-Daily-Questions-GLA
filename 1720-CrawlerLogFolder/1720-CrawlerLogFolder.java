// Last updated: 8/7/2025, 2:49:59 PM
class Solution {
    public int minOperations(String[] logs) {
        Stack<String> st=new Stack<>();
        for(String s:logs)
        {
            if(s.equals("../")) {
                if(st.size()!=0) st.pop(); 
                else continue;//for stack empty
            }
            else if(s.equals("./")) continue;
            else st.push(s);
        }
        System.out.print(st);
        return st.size();
    }
}