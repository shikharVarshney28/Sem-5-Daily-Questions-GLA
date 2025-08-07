// Last updated: 8/7/2025, 2:50:14 PM
class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        HashSet<Integer> reachable = new HashSet<>();
        HashSet<Integer> unreachable =new HashSet<>();
        List<Integer> ans=new ArrayList <>();
        for(List<Integer> edge:edges){
            if(!reachable.contains(edge.get(0))) unreachable.add(edge.get(0));
            reachable.add(edge.get(1));
            if(unreachable.contains(edge.get(1))) unreachable.remove(edge.get(1));
        }
        for(int i: unreachable) ans.add(i);
        return ans;
    }
}