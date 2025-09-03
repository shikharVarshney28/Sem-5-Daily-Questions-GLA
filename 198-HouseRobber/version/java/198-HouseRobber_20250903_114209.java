// Last updated: 9/3/2025, 11:42:09 AM
class Solution {
    int dp[];
    int find(int nums[],int idx){
        if(idx<0) return 0;
        if(dp[idx]!=-1) return dp[idx];
        return dp[idx]=Math.max(find(nums,idx-1),find(nums,idx-2)+nums[idx]);
    }
    public int rob(int[] nums) {
        if(nums.length == 1) return nums[0];
        if(nums.length == 2) return Math.max(nums[0],nums[1]);
        return topDown(nums);
    }
    public int topDown(int nums[]){
        dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0],nums[1]);
        for(int i=2;i<nums.length;i++){
            dp[i]  = Math.max(dp[i-1],dp[i-2]+nums[i]);
        }
        return dp[nums.length-1];
    }
}