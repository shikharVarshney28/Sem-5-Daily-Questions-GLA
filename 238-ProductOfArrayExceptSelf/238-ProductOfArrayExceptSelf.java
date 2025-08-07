// Last updated: 8/7/2025, 2:57:07 PM
class Solution {
    public int[] productExceptSelf(int[] nums) {
       int leftPro[]=new int [nums.length];
       int rightPro[]=new int[nums.length];
       leftPro[0]=1;
       //left Product where we havnt to include the itself element thus added lP[0]=1
       for(int i=1;i<nums.length;i++){
        leftPro[i]=leftPro[i-1]*nums[i-1];
       }
       //right Product where we havnt to include the itself element thus added rP[lst idx]=1
       rightPro[nums.length-1]=1;
       for(int i=nums.length-2;i>=0;i--){
        rightPro[i]=rightPro[i+1]*nums[i+1];
       }
       for(int i=0;i<nums.length;i++){
        nums[i]=leftPro[i]*rightPro[i];
       }
       return nums;
    }
}