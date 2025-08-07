// Last updated: 8/7/2025, 2:43:05 PM
class Solution {
    public int maxSumDistinctTriplet(int[] x, int[] y) {
        HashMap<Integer,Integer> hmap = new HashMap<>();
        for(int i=0;i<x.length;i++){
            int a = x[i],b=y[i];
            if(!hmap.containsKey(a) || b>hmap.get(a)) hmap.put(a,b);
        }
        if(hmap.size()<3) return -1;
        List<Integer> arr= new ArrayList <>(hmap.values());
        Collections.sort (arr,Collections.reverseOrder());
        return arr.get(0)+arr.get(1)+arr.get(2);
    }
}