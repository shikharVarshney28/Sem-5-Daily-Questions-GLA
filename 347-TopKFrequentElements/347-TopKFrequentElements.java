// Last updated: 8/7/2025, 2:56:10 PM
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int size=0;
        Map<Integer,Integer> h=new HashMap<>();
        for(int i:nums)
        {
            if(!h.containsKey(i)) h.put(i,1);
            else h.put(i,h.get(i)+1);
        }
        int []arr=new int[k];
        int idx=0;
        for(int i=1;i<=k;i++)
        {
            int mac=0,max_val=0;
            for(int j:h.keySet())
            {
                if(mac<(int)Math.max(mac,h.get(j)))
                {
                    mac=(int)Math.max(mac,h.get(j));
                    max_val=j;
                }
                
            }
            h.remove(max_val);
            arr[idx++]=max_val;

        }
        return arr;

    }
}