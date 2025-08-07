// Last updated: 8/7/2025, 2:56:43 PM
class Solution {
    public void moveZeroes(int[] nums) {
        int k=-1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                k++;
                nums[k]=nums[i];
            }
        }
        k++;
        for(int i=k;i<nums.length;i++) nums[i]=0;
    }
}