// Last updated: 8/7/2025, 2:56:07 PM
class Solution {
    HashMap freq(int [] arr)
    { 
        HashMap<Integer,Integer> hmap=new HashMap<>();
        for(int i:arr)
        {
            if(!hmap.containsKey(i)) hmap.put(i,1);
            else hmap.put(i,hmap.get(i)+1);
        }
        return hmap;
    }
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> h1=freq(nums1);
        int size=0,k=0;
        ArrayList<Integer> a=new ArrayList<>();
        for(int i:nums2)
        {
            if(h1.containsKey(i) && h1.get(i)>0)
            {
                a.add(i);
                size++;
                h1.put(i,h1.get(i)-1);
            }
        }
        int ans[]=new int[size];
        for(int i=0;i<size;i++) ans[k++]=a.get(i);
        return ans;
    }
}