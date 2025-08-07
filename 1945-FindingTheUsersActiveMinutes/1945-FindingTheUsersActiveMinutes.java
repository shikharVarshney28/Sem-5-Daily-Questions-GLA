// Last updated: 8/7/2025, 2:49:11 PM
class Solution {
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        HashMap<Integer,HashSet<Integer>> h=new HashMap<>();
        for(int [] i:logs){
            if(!h.containsKey(i[0])){
                HashSet<Integer> set=new HashSet<>();
                set.add(i[1]);
                h.put(i[0],set);
            }else{
                HashSet<Integer> set=h.get(i[0]);
                set.add(i[1]);
                h.put(i[0],set);
            }
        }
        int arr[]= new int[k];
        for(int i:h.keySet()){
            int size=h.get(i).size();
            arr[size-1]++;
        }
        return arr;
    }
}