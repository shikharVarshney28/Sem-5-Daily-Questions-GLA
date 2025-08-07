// Last updated: 8/7/2025, 2:52:24 PM
class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> l=new ArrayList<>();
        long sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum=(sum*2+nums[i])%10;
            l.add(sum==5|| sum==0);
        }
        return l;
    }
}