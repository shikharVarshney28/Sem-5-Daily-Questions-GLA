// Last updated: 8/7/2025, 2:49:30 PM
class Solution {
    public int sumOfUnique(int[] nums) {
        Arrays.sort(nums);
        Stack <Integer> st=new Stack<>();
        int sum=0;
        int freq[]=new int[101];
        for(int i=0;i<nums.length;i++)
        {
            freq[nums[i]]++;
        }
        for(int i=0;i<=nums[nums.length-1];i++)
            if(freq[i]==1) sum+=i;
        return sum;
    }
}