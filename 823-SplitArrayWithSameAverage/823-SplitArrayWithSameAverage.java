// Last updated: 8/7/2025, 2:53:26 PM
class Solution {
    int dp[][];
    boolean find(int nums[],int ls,int rs,int ll,int rl,int idx){
        if(ll>0 && rl>0 && (ls*1.0/ll) == (rs*1.0/rl)) return true;
        if(idx>=nums.length) return false;
        if(dp[idx][ls]!=0) return dp[idx][ls]==1;
        boolean f=false;
        for(int i = idx;i<nums.length;i++){
            f=f|| find(nums,ls+nums[i],rs-nums[i],ll+1,rl-1,i+1);
            if(f){
                dp[idx][ls]= 1;
                return true;
            }
        }
        dp[idx][ls]=(f ? 1 :-1);
        return f;
    }
    public boolean splitArraySameAverage(int[] nums) {
        
        if(nums.length <=1) return false;
        int sum = Arrays.stream(nums).sum();
        dp=new int[nums.length][sum+1];
       return  find(nums,0,sum,0,nums.length,0);
    }
}