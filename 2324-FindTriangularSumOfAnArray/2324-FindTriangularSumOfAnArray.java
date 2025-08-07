// Last updated: 8/7/2025, 2:47:56 PM
class Solution {
    public int triangularSum(int[] nums) {
        int n=nums.length-1,idx=0;
        while(n-->0){
            for(int i=0;i<nums.length-idx-1;i++){
                nums[i]=(nums[i]+nums[i+1])%10;
            }
           // for(int i:nums) System.out.print(i+" ");
            idx++;
            //System.out.println();
        }
        return nums[0];
    }
}