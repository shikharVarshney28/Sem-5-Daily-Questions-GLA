// Last updated: 8/7/2025, 2:58:26 PM
class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> st = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i].equals( "+") || tokens[i].equals( "*") || tokens[i].equals( "-")|| tokens[i].equals( "/")) {
                int val2=Integer.parseInt(st.pop()),val1=Integer.parseInt(st.pop()),res=0;
              if(tokens[i].equals( "+"))  res=val1+val2; 
              if(tokens[i].equals( "*")) res=val1*val2;
              if(tokens[i].equals( "/")) res=val1/val2;
              if (tokens[i].equals( "-")) res=val1-val2; 
              st.push(""+res);
            }
            else st.push(tokens[i]);
        }
        return Integer.parseInt(st.pop());
    }
}