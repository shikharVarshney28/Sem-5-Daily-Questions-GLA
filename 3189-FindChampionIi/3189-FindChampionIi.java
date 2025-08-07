// Last updated: 8/7/2025, 2:45:45 PM
class Solution {
    public int findChampion(int n, int[][] edges) {
        
        HashSet<Integer> stronger=new HashSet<>();
        HashSet<Integer> weaker=new HashSet<>();
        for(int i=0;i<=n-1;i++) stronger.add(i);
        for(int edge[]:edges){
            if(!weaker.contains(edge[0])) stronger.add(edge[0]);
            if(stronger.contains(edge[1])) {
                stronger.remove(edge[1]);
                weaker.add(edge[1]);
            }
            else weaker.add(edge[1]);
        }
        if(stronger.size()==1){
            for(int i:stronger) return i;
        }
        return -1;
    }
}