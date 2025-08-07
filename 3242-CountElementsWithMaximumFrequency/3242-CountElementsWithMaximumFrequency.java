// Last updated: 8/7/2025, 2:45:30 PM
class Solution {
    public int maxFrequencyElements(int[] nums) {
       HashMap<Integer,Integer> h=new HashMap<>();
       int maxFreq=0;
       for(int i:nums){
        if(!h.containsKey(i)) h.put(i,1);
        else h.put(i,h.get(i)+1);
        if(maxFreq<h.get(i)) maxFreq=h.get(i);

       }
       int count=0;
       for(int i:h.keySet())
       {
        if(h.get(i)==maxFreq) count+=h.get(i);
       }
       return count;
    }
}