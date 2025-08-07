// Last updated: 8/7/2025, 2:45:25 PM
class Solution {
    int countOnes(int n){
        String s=Integer.toBinaryString(n);
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1') count++;
        }
        return count;
    }
    public boolean canSortArray(int[] nums) {
        for(int i=0;i<nums.length;i++){
            boolean isSwapDone=false;
            for(int j=0;j<nums.length-i-1;j++){
                if(nums[j]>nums[j+1]){
                if(countOnes(nums[j]) == countOnes(nums[j+1])){
                    isSwapDone=true;
                    // swapping will occur
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
                else return false;
              }
            }
            if(!isSwapDone) break;
        }  
        return true;      
    }
}