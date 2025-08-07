// Last updated: 8/7/2025, 2:46:21 PM
class Solution {
    public int[] leftRightDifference(int[] nums) {
        int leftSum[]=new int[nums.length];
        int rightSum[]=new int[nums.length];
        for(int i=1;i<nums.length;i++)
        {
            leftSum[i]=nums[i-1]+leftSum[i-1];
        }
        for(int i=nums.length-2;i>=0;i--)
        {
            rightSum[i]=nums[i+1]+rightSum[i+1];
        }
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=Math.abs(rightSum[i]-leftSum[i]);
        }
        return nums;
    }
}