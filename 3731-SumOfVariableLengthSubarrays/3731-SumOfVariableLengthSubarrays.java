// Last updated: 8/7/2025, 2:43:50 PM
class Solution {
    public int subarraySum(int[] nums) {
        int ans=0,n=nums.length;
        for(int i=0;i<n;i++){
            int j=Math.max(0,i-nums[i]);
            for(;j<=i;j++) ans+=nums[j];
        }
        return ans;
    }
}