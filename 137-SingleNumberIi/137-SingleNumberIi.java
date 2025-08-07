// Last updated: 8/7/2025, 2:58:43 PM
class Solution {
    public int singleNumber(int[] nums) {
        Stack <Integer> st=new Stack<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
        {
            if(st.size()==0 || st.peek()!=nums[i]) st.push(nums[i]);
            else if(i==nums.length-1|| nums[i]!=nums[i+1]) st.pop();
            else continue;
        }
        return st.peek();
    }
}