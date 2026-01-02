// Last updated: 1/2/2026, 3:21:09 PM
1class Solution {
2    public int[] getConcatenation(int[] nums) {
3        int ans[]=new int[nums.length*2];
4        for(int i=0;i<nums.length;i++)
5        {
6            ans[i]=nums[i];
7            ans[i+nums.length]=nums[i];
8        }
9        return ans;
10    }
11}