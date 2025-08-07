// Last updated: 8/7/2025, 2:54:45 PM
class Solution {
    public int singleNonDuplicate(int[] nums) {
        int j=1,i=0;
        for(i=0;i<nums.length-1;i+=2)
        {
            if(nums[i]!=nums[j]) break;
            j+=2;
        }
        return nums[i];
    }
}