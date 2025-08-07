// Last updated: 8/7/2025, 3:00:35 PM
class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> h=new HashSet<>();
        for(int i:nums) h.add(i);
        int k=1;
        while(true)
        {
            if(!h.contains(k)) break;
            k++;
        }
        return k;
    }
}