// Last updated: 8/7/2025, 2:45:41 PM
class Solution {
    public long countSubarrays(int[] nums, int k) {
        long ans=0;
        int max=0;
        for(int i:nums) max = Math.max(i,max);
        int maxFound=0,i=0,st=0;
        while(i<nums.length){
            if(nums[i] == max){
                maxFound++;
                if(maxFound == k){
                    ans= ans + 1 + (nums.length -1 - i);
                    while(st<=i && maxFound==k){
                        if(nums[st++]==max){
                            maxFound--;
                            break;
                        }
                        ans+=(nums.length- i);
                    }
                }
            }
            i++;
        }
        return ans;
    }
}