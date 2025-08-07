// Last updated: 8/7/2025, 2:51:34 PM
class Solution {

    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> h1=new HashSet<>();
        for(int i:nums1) h1.add(i);
        HashSet<Integer> h2=new HashSet<>();
        for(int i:nums2) h2.add(i);
        ArrayList<Integer> a=new ArrayList<>();
        for(int i:h1)
        {
            // if in h2 then remove
            if(h2.contains(i))
            {
                //h1.remove(i);
                h2.remove(i);
            }
            else a.add(i);
        }
       
        List<List<Integer>> ans=new ArrayList<>();
       ans.add(a);
        a=new ArrayList<>();
        for(int i:h2) a.add(i);
        ans.add(a);
        return ans;
    }
}