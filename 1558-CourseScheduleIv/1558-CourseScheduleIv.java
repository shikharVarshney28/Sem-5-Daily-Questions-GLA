// Last updated: 8/7/2025, 2:50:38 PM
class Solution {
    boolean dfs(int src,List<List<Integer>> adjList,int dest,boolean isVis[]){
        if(adjList.get(src).contains(dest)) return true;
        boolean res=false;
        isVis[src]=true;
        for(int child:adjList.get (src)){
            if(isVis[child]) continue;
            res=res || dfs(child,adjList,dest,isVis);
            if(res) break;
        }
        return res;
    }
    public List<Boolean> checkIfPrerequisite(int numCourses, int[][] prerequisites, int[][] queries) {
        List<List<Integer>> adjList =new ArrayList <>();
        List<Boolean> ans=new ArrayList <>();
        for(int i=0;i<numCourses;i++){
            adjList.add (new ArrayList <>());
        }
        for(int edge[]:prerequisites){
            adjList.get(edge[0]).add(edge[1]);
        }
        for(int query[]:queries){
            boolean [] isVis=new boolean [numCourses];
            ans.add (dfs(query[0],adjList,query [1],isVis));
        }
        return ans;
    }
}