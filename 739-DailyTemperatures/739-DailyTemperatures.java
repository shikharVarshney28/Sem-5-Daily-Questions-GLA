// Last updated: 8/7/2025, 2:53:56 PM
class Solution {
    public int[] dailyTemperatures(int[] arr) {
        int n=arr.length-1;
        Stack<Integer> st=new Stack<>();
        int answer[]=new int[n+1];
        answer[n]=0;
        st.push(n);
        for(int i=n-1;i>=0;i--)
        {
            while(st.size()!=0 && arr[i]>=arr[st.peek()]) st.pop();
            if(st.size()==0) answer[i]=0;
            else answer[i]=st.peek()-i;
            st.push(i);
        }
        return answer;
    }
}