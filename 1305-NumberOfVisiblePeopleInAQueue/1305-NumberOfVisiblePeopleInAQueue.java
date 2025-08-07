// Last updated: 8/7/2025, 2:51:49 PM
class Solution {
    public int[] canSeePersonsCount(int[] heights) {
        Stack<Integer>st=new Stack<>();
        int n = heights.length;
        int ans[]=new int[n];
        ans[n-1]=0;
        st.push(heights[n-1]);
        for(int i=n-2;i>=0;i--){
            int seen=0;
            while(st.size()>0 && st.peek()<heights[i]){
                seen++;
                st.pop();
            }
            if(st.size()==0) ans[i]=seen;
            else ans[i]=seen+1;
            st.push(heights[i]);
        }
        return ans;
    }
}