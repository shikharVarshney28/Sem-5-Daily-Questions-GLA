// Last updated: 8/7/2025, 2:55:06 PM
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer>st = new Stack <>();
        int n = nums.length;
        int ans[]=new int[n];
        for(int i=n-2;i>=0;i--) st.push(nums[i]);
        for(int i=n-1;i>=0;i--){
            while(st.size()>0 && st.peek()<=nums[i]) st.pop();
            ans[i]= st.size()>0?st.peek():-1;
            st.push(nums[i]);
        }
        return ans;
    }
}