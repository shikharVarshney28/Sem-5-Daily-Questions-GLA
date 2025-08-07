// Last updated: 8/7/2025, 2:57:26 PM
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]==nums[i+1]) return true;
        }
        return false;
    }
}