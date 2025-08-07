// Last updated: 8/7/2025, 2:57:35 PM
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum=0,start=0,i=0,size=Integer.MAX_VALUE;
        while(i<nums.length){
            sum+=nums[i];
            while(start<i && sum-nums[start]>=target){
                    sum-=nums[start++];
                }
            if(sum>=target) {
                size=Math.min(size,i-start+1);
            }
            i++;
        }
        return size==Integer.MAX_VALUE ? 0 : size;
    }
}