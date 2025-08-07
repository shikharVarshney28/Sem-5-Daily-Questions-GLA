// Last updated: 8/7/2025, 2:46:25 PM
class Solution {
    public long findScore(int[] nums) {
        TreeMap<Integer,ArrayList<Integer>> hmap=new TreeMap <>();
        boolean check[]=new boolean [nums.length];
        long  score =0;
        for(int i=0;i<nums.length;i++){
            if(!hmap.containsKey (nums[i])){
                ArrayList<Integer> a=new ArrayList <>();
                a.add(i);
                hmap.put(nums[i],a);
            }else{
                ArrayList<Integer> a=hmap.get(nums[i]);
                a.add(i);
                hmap.put (nums[i],a);
            }
        }
        for(int i:hmap.keySet ()){
            for(int j:hmap.get (i)){
                //if(check[j]) continue;
                if(!check[j]) {
                    score+=i;
                if(j>0) check[j-1]=true;
                if(j<nums.length-1) check[j+1]=true;
                }
            }
        }
        return score;






    }
}