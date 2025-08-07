// Last updated: 8/7/2025, 2:52:50 PM
class Solution {
    int minAddToMakeValid(String s){
                Stack<Character> st=new Stack<>();
                        int count=0;
                                for(int i=0;i<s.length();i++)
                                        {
                                                    char curr=s.charAt(i);
                                                                if(curr=='(') st.push(curr);
                                                                            else{
                                                                                            if(st.isEmpty()) count++;
                                                                                                            else if(st.peek()=='(' && curr==')') st.pop();
                                                                                                                        }
                                                                                                                                }
                                                                                                                                    return count+st.size();
    }
}