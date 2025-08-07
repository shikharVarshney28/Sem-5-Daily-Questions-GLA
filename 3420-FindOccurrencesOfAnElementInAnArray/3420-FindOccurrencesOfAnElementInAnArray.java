// Last updated: 8/7/2025, 2:44:58 PM
class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        HashMap<Integer,List<Integer>> hmap=new HashMap<>();
        hmap.put(x,new ArrayList<>());
        for(int i=0;i<nums.length;i++){
            if(x==nums[i]){
                List<Integer> l=hmap.get(x);
                l.add(i);
                hmap.put(x,l);
            }
        }
        int res[]=new int[queries.length],idx=0;
        for(int i:queries){
            if(i<=hmap.get(x).size()){
                res[idx++]=hmap.get(x).get(i-1);
            }else res[idx++]=-1;
        }
        return res;
    }
}