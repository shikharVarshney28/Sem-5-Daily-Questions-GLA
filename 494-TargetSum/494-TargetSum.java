// Last updated: 8/7/2025, 2:55:12 PM
class Solution {
    int ans=0;
    void find(int []nums,int idx,int sum,int target){
        if(idx>=nums.length){
            //System.out.println (sum);
            if(target==sum) ans++;
            return;
        }
        find(nums,idx+1,sum-nums[idx],target);
        find(nums,idx+1,sum+nums[idx],target);
    }
    public int findTargetSumWays(int[] nums, int target) {
        /*for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int j=0;j<i;j++) sum+=nums[j];
            find(nums,i,sum,target);
        }*/
        find(nums,0,0,target);
        return ans;
    }
}