// Last updated: 8/7/2025, 2:47:20 PM
class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i:nums)
        {
            if(!h.containsKey(i)) h.put(i,1);
            else h.put(i,h.get(i)+1);
        }
        int max_numb=-1,max_freq=0;
        for(int i:h.keySet())
        {
            if(i%2==0)
            {
                if(max_freq<h.get(i))
                {
                    max_numb=i;
                    max_freq=h.get(i);
                }
                else if(max_freq==h.get(i)){
                    max_numb=Math.min(max_numb,i);                
                    }
            }
        }
        return max_numb;
    }
}