// Last updated: 8/7/2025, 2:51:03 PM
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int answer[]=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            int count=0;
            for(int j=0;j<nums.length;j++)
            {
                if(nums[i]>nums[j] && i!=j) count++;
            }
            answer[i]=count;
        }
        return answer;
    }
}