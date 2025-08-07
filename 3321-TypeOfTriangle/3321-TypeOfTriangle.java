// Last updated: 8/7/2025, 2:45:21 PM
class Solution {
    public String triangleType(int[] nums) {
        String s="none";
        if((nums[0]+nums[1]>nums[2]) &&( nums[1]+nums[2]>nums[0]) && (nums[0]+nums[2]>nums[1]))
        {
            if(nums[0]==nums[1] && nums[1]==nums[2] ) s="equilateral";
            else if(nums[0]!=nums[1] && nums[1]!=nums[2] && nums[0]!=nums[2]) s="scalene";
            else s="isosceles";
        }
        return s;
    }
}