// Last updated: 8/7/2025, 2:45:19 PM
class Solution {
    public boolean isPossibleToSplit(int[] nums) {
       int f[]=new int[101];
       for(int i=0;i<nums.length;i++)
        f[nums[i]]++;
    for(int i=0;i<101;i++) 
        if(f[i]>2) return false;
    
    return true;
    }
}