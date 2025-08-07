// Last updated: 8/7/2025, 2:55:32 PM
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]==nums[i+1]) ans.add(nums[i]);
        }
        return ans;
    }
}