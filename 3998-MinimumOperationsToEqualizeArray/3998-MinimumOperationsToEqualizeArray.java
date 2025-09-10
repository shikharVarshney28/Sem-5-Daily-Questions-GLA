// Last updated: 9/10/2025, 10:27:33 AM
class Solution {
    //simply its saying that to replace the subbray [l,r] to and of [l,r] which means to replace all ele by and of all the ele [0,nums.length ) of the aerathve all ele equals  no opr is req
    public int minOperations(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] != nums[i])
                return 1;
        }
        return 0;
    }
}