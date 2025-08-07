// Last updated: 8/7/2025, 2:57:29 PM
class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        Stack<Integer> st=new Stack<>();
        // for(int i=0;i<nums.length;i++)
        // {
        //     if(st.size()==0 || st.peek()!=nums[i]) st.push(nums[i]);
        // }
        // int max=0;
        // for(int i=1;i<k;i++) st.pop();
        return nums[nums.length-k];

    }
}