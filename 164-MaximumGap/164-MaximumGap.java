// Last updated: 8/7/2025, 2:58:09 PM
class Solution {
    public int maximumGap(int[] nums) {
       Arrays.sort(nums);
       int max=0;
       for(int i=0;i<nums.length-1;i++)
       {
        int diff=(int)Math.abs(nums[i]-nums[i+1]);
        if(diff>max) max=diff;
       } 
       return max;
    }

}