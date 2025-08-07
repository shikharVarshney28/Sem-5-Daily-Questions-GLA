// Last updated: 8/7/2025, 3:00:46 PM
class Solution {
    public int search(int[] nums, int target) 
    {
        int i;
        for(i=0;i<nums.length;i++)
        {
            if (target==nums[i])
            {
                 break;
            }
            
        }
        if (i==nums.length)
            return -1;
        else
            return i;
    }
}