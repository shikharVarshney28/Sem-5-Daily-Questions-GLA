// Last updated: 8/7/2025, 2:59:41 PM
class Solution {
    public int removeDuplicates(int[] nums) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<nums.length;i++)
        {
            if(st.size()==0 || st.peek()!=nums[i]) st.push(nums[i]);
            else if(i==nums.length-1 || nums[i]!=nums[i+1]) st.push(nums[i]);
            else continue;
        }
        int n=st.size();
        for(int i=n-1;i>=0;i--)
            nums[i]=st.pop();
        return n;
    }
}