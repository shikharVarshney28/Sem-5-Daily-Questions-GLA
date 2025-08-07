// Last updated: 8/7/2025, 2:48:26 PM
class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> a=new ArrayList<>();
        Arrays.sort(nums);
        //BinarySearch
        for(int i=0;i<nums.length;i++)
            if(nums[i]==target) a.add(i);
        
        return a;
    }
}