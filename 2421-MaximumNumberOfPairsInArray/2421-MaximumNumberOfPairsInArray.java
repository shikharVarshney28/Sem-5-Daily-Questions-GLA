// Last updated: 8/7/2025, 2:47:42 PM
class Solution {
    public int[] numberOfPairs(int[] nums) {
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i:nums)
        {
            if(!h.containsKey(i)) h.put(i,1);
            else h.put(i,h.get(i)+1);
        }
        int sum=0,freq=0;
        for(int i:h.keySet())
        {
            sum=sum+h.get(i)/2;
            h.put(i,h.get(i)%2);
        }
        for(int i:h.keySet())
        {
            if(h.get(i)==1) freq++;
        }
        int ans[]=new int[]{sum,freq};
        return ans;
    }
}