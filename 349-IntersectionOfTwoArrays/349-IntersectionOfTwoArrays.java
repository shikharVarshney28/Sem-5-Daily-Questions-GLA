// Last updated: 8/7/2025, 2:56:09 PM
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
       HashSet<Integer> h=new HashSet<>();
        for(int i:nums1) h.add(i);
        ArrayList<Integer> a=new ArrayList<>();
        int size=0,k=0;
        for(int i:nums2)
        {
            if(h.contains(i))
            {
                a.add(i);
                size++;
                h.remove(i);
            }
        }
        int ans[]=new int[size];
        for(int i=0;i<size;i++) ans[k++]=a.get(i);
        return ans;

    }
}