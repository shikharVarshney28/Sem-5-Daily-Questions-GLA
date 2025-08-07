// Last updated: 8/7/2025, 2:51:30 PM
class Solution {
    public List<List<Integer>> groupThePeople(int[] gS) {
       HashMap<Integer,List<Integer>> h=new HashMap<>();
       List<List<Integer>> ans=new ArrayList<>();
       for(int i=0;i<gS.length;i++)
       {
        if(!h.containsKey(gS[i])) h.put(gS[i],new ArrayList<Integer>());
       List<Integer> a=h.get(gS[i]);
       a.add(i);
       if(a.size()==gS[i]){
        ans.add(a);
        h.put(gS[i],new ArrayList<Integer>());
       }
       else
       h.put(gS[i],a);
       }
       return ans;
    }
}