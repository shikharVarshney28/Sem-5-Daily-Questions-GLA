// Last updated: 8/7/2025, 2:56:03 PM
class Solution {
    int dp[][];
    int find(int[]nums,int idx,int target){
        if(target == 0) return 1;
        if(idx<nums.length && dp[idx][target]!=-1) return dp[idx][target];
        int ans =0;
        for(int i= 0;i<nums.length;i++){
            if(target >=nums[i]){
                ans += find(nums,i,target-nums[i]);
            }
        }
        return dp[idx][target]=ans;
    }
    public int combinationSum4(int[] nums, int target) {
        dp=new int[nums.length][target+1];
        for(int i[]:dp){
            Arrays.fill (i,-1);
        }
        return find(nums,0,target);
    }
}