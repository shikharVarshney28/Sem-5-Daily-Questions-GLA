// Last updated: 8/7/2025, 2:57:25 PM
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> hmap=new HashSet <>();
        int i=0,j=0;
        for(;i<=k && i<nums.length;i++){
            if(hmap.contains(nums[i])) return true;
            hmap.add(nums[i]);
        }
        
        //System.out.println (hmap);
        for(;i<=nums.length-1;i++){
            hmap.remove(nums[j++]);
            if(hmap.contains(nums[i])) return true;
            hmap.add(nums[i]);
            //System.out.println (hmap);
        }
        return false;
    }
}