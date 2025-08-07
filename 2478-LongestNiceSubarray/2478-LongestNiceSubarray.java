// Last updated: 8/7/2025, 2:47:22 PM
class Solution {
    public int longestNiceSubarray(int[] nums) {
        int ans =0,len=1,ele=nums[0],st=0;
        for(int i=1;i<nums.length;i++){
            while(st!=i && (nums[i] & ele)!=0){
                len--;
                ele^=nums[st++];
            }
            len++;
            ans = Math.max (ans,len);
            ele|=nums[i];
        }
        return Math.max (len,ans);
    }
}