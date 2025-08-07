// Last updated: 8/7/2025, 2:56:41 PM
class Solution {
    public int findDuplicate(int[] nums) {
        int [] freq=new int[100001];
        int i=0;
        for(i=0;i<nums.length;i++)
        {
            freq[nums[i]]++;
            if(freq[nums[i]]==2) break;
        }
        return nums[i];
    }
}