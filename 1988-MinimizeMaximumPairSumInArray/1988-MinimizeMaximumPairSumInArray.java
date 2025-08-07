// Last updated: 8/7/2025, 2:49:03 PM
class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int st=0,end=nums.length-1;
        int maxSum=Integer.MIN_VALUE;
        while(st<end)
        {
            maxSum=Math.max(maxSum,nums[st]+nums[end]);
            st++;end--;
        }
        return maxSum;
    }
}