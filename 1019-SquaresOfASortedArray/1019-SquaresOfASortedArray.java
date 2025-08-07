// Last updated: 8/7/2025, 2:52:38 PM
import java.util.Arrays;
class Solution {
    public int[] sortedSquares(int[] nums) 
    {
    
        for(int i=0;i<nums.length;i++)
            nums[i]=nums[i]*nums[i];
        Arrays.sort(nums);
        return nums;
    }
}