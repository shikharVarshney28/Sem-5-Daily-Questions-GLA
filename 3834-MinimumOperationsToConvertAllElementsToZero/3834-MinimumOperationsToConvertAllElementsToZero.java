// Last updated: 11/19/2025, 12:33:46 PM
class Solution {
    public int minOperations(int[] nums) {
        int opr = 0;
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < nums.length; i++) {
           
            while (st.size() > 0 && st.peek() > nums[i])
                st.pop();
                if(nums[i] == 0) continue;
            if (st.size() == 0 || st.peek() != nums[i])
                opr++;
            st.push(nums[i]);
        }
        return opr;
    }
}