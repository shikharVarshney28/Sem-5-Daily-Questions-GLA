// Last updated: 8/7/2025, 2:43:32 PM
class Solution {
    public int numberOfComponents(int[][] properties, int k) {
        List<List<Integer>> adjList = new ArrayList <>();
        for(int i=0;i<properties.length;i++){
            adjList.add (new ArrayList <>());
        }
        for(int i=0;i<properties.length;i++){
            for(int j=i+1;j<properties.length;j++){
                int a[]=properties[i],b[]=properties [j];
                if(intersection(a,b)>=k){
                    adjList.get(i).add(j);
                    adjList.get (j).add(i);
                }
            }
        }
        int ans=0;
        boolean vis[]=new boolean[properties. length];
        for(int i=0;i<properties.length;i++){
            if(!vis[i]){
                dfs(adjList,vis,i);
                ans++;
            }
        }
        return ans;
    }
    int intersection(int a[],int b[]){
        HashSet<Integer> hSet=new HashSet<>();
        for(int i:a) hSet.add (i);
        int cnt=0;
        for(int i:b){
            if(hSet.contains (i)){
                cnt++;
                hSet.remove (i);
            }
        }
        return cnt;
    }
    void dfs(List<List<Integer>> adjList,boolean[] vis,int src){
        vis[src]=true;
        for(int i:adjList.get(src)){
            if(vis[i]) continue;
            dfs(adjList,vis,i);
        }
    }
}