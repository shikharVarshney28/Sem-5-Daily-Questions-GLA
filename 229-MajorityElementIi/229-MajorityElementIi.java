// Last updated: 8/7/2025, 2:57:20 PM
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> a=new ArrayList<>();
        int n=nums.length/3;
        HashMap<Integer,Integer>h=new HashMap<>();
        for(int i:nums)
        {
            if(!h.containsKey(i)) h.put(i,1);
            else h.put(i,h.get(i)+1);
            //if(h.get(i)>n) a.add(i);
        }
        for(int i:h.keySet())
        {
            if(h.get(i)>n) a.add(i);
        }
        return a;
    }
}