// Last updated: 8/7/2025, 2:47:04 PM
class Solution {
    public int countDistinctIntegers(int[] nums) {
        Set<Integer> ans=new HashSet<>();
        for(int i:nums)
        {
            ans.add(i);
            StringBuilder s=new StringBuilder().append(i);
            s.reverse();
            int rev=Integer.parseInt(s.toString());
            ans.add(rev);
        }
        return ans.size();
    }
}