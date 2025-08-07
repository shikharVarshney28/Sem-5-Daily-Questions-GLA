// Last updated: 8/7/2025, 2:44:52 PM
class Solution {
    public boolean isArraySpecial(int[] nums) {
        int n=nums.length;
        if(n==1) return true;
        if((nums[0]%2==0 && nums[1]%2==0) || (nums[0]%2!=0 && nums[1]%2!=0) || (nums[n-1]%2==0 && nums[n-2]%2==0) || (nums[n-1 ]%2!=0 && nums[n-2]%2!=0)) return false;
        for(int i=1;i<n-1;i++){
            if((nums[i-1]%2==0 && nums[i]%2==0) || (nums[i-1]%2!=0 && nums[i]%2!=0) || (nums[i]%2==0 && nums[i+1]%2==0) || (nums[i]%2!=0 && nums[i+1]%2!=0)) return false;
        }
        return true;
    }
}