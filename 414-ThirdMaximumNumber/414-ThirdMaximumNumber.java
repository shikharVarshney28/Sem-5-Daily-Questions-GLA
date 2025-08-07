// Last updated: 8/7/2025, 2:55:43 PM
class Solution {
    public int thirdMax(int[] nums) {
        Stack <Integer> st=new Stack<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
            if(st.size()==0||st.peek()!=nums[i]) st.push(nums[i]);
        if(st.size()<3) return st.peek();
        for(int i=1;i<3;i++) st.pop();
        return st.peek(); 

    }
}