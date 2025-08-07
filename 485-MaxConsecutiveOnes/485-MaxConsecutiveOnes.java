// Last updated: 8/7/2025, 2:55:14 PM
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
      int count=0,max=0;
      for(int i=0;i<nums.length;i++)
      {
        if(nums[i]==1) count++;
        else if(nums[i]==0 && count!=0)
        {
            if(count>max) max=count;
            count=0;
        }
      }
      if(count>max) max=count;
      return max;  
    }
}