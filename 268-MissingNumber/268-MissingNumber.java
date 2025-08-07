// Last updated: 8/7/2025, 2:56:50 PM
class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int max=nums[nums.length-1],k=0;
        for(int i=0;i<max+1;i++)
        {
            if(k!=nums[i]) return k;
            k++;
        }
        return k;
    }
}