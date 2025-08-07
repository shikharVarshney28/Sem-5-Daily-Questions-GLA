// Last updated: 8/7/2025, 2:48:07 PM
class Solution {
    public int[] rearrangeArray(int[] nums) 
    {
        int pos[]=new int[nums.length/2];
        int neg[]=new int[nums.length/2];
        int p=0,n=0;
        for(int i:nums)
        {
            if(i<0) neg[n++]=i;
            else pos[p++]=i;
        }
        int z=0;p=0;n=0;
        while(z<nums.length)
        {
            nums[z++]=pos[p++];
            nums[z++]=neg[n++];
        }
        return nums;
    }
}