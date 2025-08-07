// Last updated: 8/7/2025, 2:55:40 PM
class Solution {
    int dp[][];
    boolean find(int[]nums,int idx,int left,int right,boolean[] used){
        if(left == right) return true;
        if(dp[idx][left]!=0) return dp[idx][left]==1;
        if(right ==0 || left>right) return false;
            boolean f = false;
        for(int i=0;i<nums.length && !f ;i++){
            if(used[i]) continue;
            used[i]=true;
        f= f || find(nums,i,left+nums[i],right-nums[i],used);
            used[i]=false;
        }
        dp[idx][left] = f ? 1 : -1;
        return f;
    }
    public boolean canPartition(int[] nums) {
        int sum = Arrays.stream (nums).sum();
        if(sum%2!=0) return false;
        dp=new int[nums.length][sum+1];
        return find(nums,0,0,Arrays.stream(nums).sum(),new boolean[nums.length]);
    }
}