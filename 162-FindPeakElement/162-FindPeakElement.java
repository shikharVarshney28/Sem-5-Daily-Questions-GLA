// Last updated: 8/7/2025, 2:58:11 PM
class Solution {
    public int findPeakElement(int[] nums) {
        int max=0;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[max]<nums[i]) max=i; 
        }
        return max;
    }
}