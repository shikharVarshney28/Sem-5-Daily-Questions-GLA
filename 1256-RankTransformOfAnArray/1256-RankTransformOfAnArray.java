// Last updated: 8/7/2025, 2:51:56 PM
class Solution {
    public int[] arrayRankTransform(int[] arr) {
        Map<Integer,Integer> h=new TreeMap<>();
        for(int i:arr){
            if(!h.containsKey(i)) h.put(i,1);
        }
        int z=1;
        for(int i:h.keySet())
        {
            h.put(i,z++);
        }
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=h.get(arr[i]);
        }
        return arr;
        

    }
}