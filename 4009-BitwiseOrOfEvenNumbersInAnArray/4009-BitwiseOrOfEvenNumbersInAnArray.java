// Last updated: 9/25/2025, 4:50:43 PM
class Solution {
    public int evenNumberBitwiseORs(int[] nums) {
        int ans =0;
        for(int i : nums) if(i%2==0) ans |= i;
        return ans;
    }
}