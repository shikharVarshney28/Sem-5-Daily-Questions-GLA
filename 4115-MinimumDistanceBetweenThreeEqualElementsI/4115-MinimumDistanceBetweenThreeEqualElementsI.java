// Last updated: 11/19/2025, 12:33:10 PM
class Solution {
    int find(List<Integer> ll){
        int min = Integer.MAX_VALUE;
        for(int i =0;i<ll.size()-2;i++){
            for(int j=i+1;j<ll.size()-1;j++){
                for(int k=j+1;k<ll.size ();k++){
                    min = Math.min(min,Math.abs(ll.get(i) - ll.get(j)) + Math.abs(ll.get(j) - ll.get(k)) + Math.abs(ll.get(k) - ll.get(i))) ;
                }
            }
        }
       // System.out.println (ll+" "+min);
        return min;
    }
    public int minimumDistance(int[] nums) {
        HashMap<Integer,List<Integer>> hmap = new HashMap <>();
        for(int i=0;i<nums.length;i++){
            
            if(hmap.containsKey(nums[i])){
                List<Integer> ll = hmap.get(nums[i]);
                ll.add(i);
                hmap.put(nums[i],ll);
                
            }else{
                List<Integer> ll = new ArrayList <>();
                ll.add(i);
                hmap.put(nums[i],ll);
            }
        }
        System.out.println(hmap);
        int min = Integer.MAX_VALUE;
        for(int i:hmap.keySet()){
            if(hmap.get(i).size()<3) continue;
            min = Math.min (min,find(hmap.get(i)));
                
        }
            
        return min == Integer.MAX_VALUE ? -1 : min;
    }
}