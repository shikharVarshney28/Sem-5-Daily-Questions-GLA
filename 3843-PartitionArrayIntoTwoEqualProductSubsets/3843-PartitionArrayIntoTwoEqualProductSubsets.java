// Last updated: 8/7/2025, 2:43:21 PM
class Solution {
    boolean find(int m,long pro1,long pro2,int []nums,long target){
        boolean f1=true,f2=true;
        for(int i=0;i<nums.length;i++){
            if((m & (1<<i) )!= 0){
                if(pro1 > target/nums[i]) f1=false;
                if(f1) pro1*=nums[i];
            }else{
                if(pro2>target/nums[i]) f2=false;
                if(f2) pro2*=nums[i];
            }
      }
        if(f1 && f2 && pro1==target && pro2==target) return true;
        return false;
    }
    public boolean checkEqualPartitions(int[] nums, long target) {
        int n = nums.length;
        for(int i=1;i<(1<<n)-1;i++){
            long pro1 = 1,pro2=1;
            if(find(i,pro1,pro2,nums,target)) return true;
        }
        return false;
    }
}