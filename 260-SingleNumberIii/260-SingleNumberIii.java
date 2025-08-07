// Last updated: 8/7/2025, 2:56:52 PM
class Solution {
    public int[] singleNumber(int[] nums) {
      HashMap<Integer,Integer> hmap=new HashMap<>();
      int ans[]=new int[2]; 
      for(int i:nums)
      {
        if(!hmap.containsKey(i)) hmap.put(i,1);
        else hmap.put(i,hmap.get(i)+1);
      } 
      int k=0;
      for(int i:hmap.keySet())
      {
        if(hmap.get(i)==1)
        {
            ans[k++]=i;
        }
      }
      return ans;
    }
}