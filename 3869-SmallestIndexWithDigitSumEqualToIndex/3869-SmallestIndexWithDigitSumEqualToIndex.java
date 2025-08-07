// Last updated: 8/7/2025, 2:43:11 PM
class Solution {
    int sum(int n){ 
        int s=0;
        while(n>0){
            s+=(n%10);
            n/=10;
        }
        return s;
    }
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(sum(nums[i])==i) return i;
        }
        return -1;
    }
}