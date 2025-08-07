// Last updated: 8/7/2025, 2:56:36 PM
class Solution {
    int find(int nums[],int curr,int prev,int []dp,int idx){
        if(idx >= nums.length) return 0;
        if(curr <= prev) return 0;
        if(dp[idx] != -10001) return dp[idx];
        int ans=0;
        for(int i=idx;i<nums.length;i++){
            ans = Math.max (ans,find(nums,nums[i],curr,dp,i));
        }
       // System.out.println (idx+" "+nums[idx]+" "+ans);
        return dp[idx]=ans+1;

    }
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        int dp[]=new int[n];
        Arrays.fill (dp,-10001);
        int ans=0;
        for(int i=0;i<n;i++){
            ans= Math.max (ans,find(nums,nums[i],-10001,dp,i));
        }
        //for(int i:dp) System.out.println (i);
        return ans;
    }
}