// Last updated: 8/7/2025, 2:50:28 PM
class Solution {
    public int[] runningSum(int[] nums) 
    {
        int sum=0;
        int a[]=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            a[i]=nums[i]+sum;
            sum+=nums[i];
        }
        return a;
    }
}