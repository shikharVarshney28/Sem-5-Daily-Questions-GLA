// Last updated: 8/7/2025, 2:54:03 PM
class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int product=1,ans=0,count=0,i=0,start=0;
        while(i<nums.length){
            //grow
            product*=nums[i];

            
            //shrink
            while(start<=i && product>=k){
                product/=nums[start++];
            }
            //update
            ans+= (i-start+1) ;     // Window size
            i++;
        }
        return ans;
    }
}