// Last updated: 8/7/2025, 2:49:14 PM
class Solution {
    public int maxAscendingSum(int[] nums) {
        int count=nums[0],len=0,n=nums.length,i=0,ans=0;
        while(i<n-1){
            if(nums[i]<nums[i+1]){
                count+=nums[i+1];
                len++;
            }else{
                ans=Math.max (ans,count);
                count=nums[i+1];
            }
            i++;
        }
        return Math.max(ans,count);
    }
}