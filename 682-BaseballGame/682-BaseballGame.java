// Last updated: 8/7/2025, 2:54:10 PM
class Solution {
    public int calPoints(String[] operations) {
        Stack<String> st=new Stack<>();
        for(String s:operations)
        {
            if(s.equals("C")) st.pop();
            else if(s.equals("D")){
                int val=Integer.parseInt(st.peek());
                st.push(""+(val*2));
            }
            else if(s.equals("+")){
                int val2=Integer.parseInt(st.pop());
                int val1=Integer.parseInt(st.pop());
                st.push(val1+"");
                st.push(val2+"");
                st.push(val1+val2+"");
            }
            else st.push(s);
        }
        int sum=0;
        while(st.size()!=0)
        {
            sum+=Integer.parseInt(st.pop()); 
        }
        return sum;
    }
}