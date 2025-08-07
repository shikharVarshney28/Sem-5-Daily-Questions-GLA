// Last updated: 8/7/2025, 2:44:54 PM
class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        int xor=0;
        int f[]=new int[51];
        for(int i=0;i<nums.length;i++)
        {
            f[nums[i]]++;
            if(f[nums[i]]==2) xor=xor^nums[i];
        }
        return xor;
    }
}