// Last updated: 8/7/2025, 2:53:29 PM
class Solution {
    void dfs(int [][]graph,int i,List<List<Integer>> ans,List<Integer>ds){
        if(i==graph.length-1){
            ds.add(i);
            ans.add (new ArrayList <>(ds));
            ds.remove (ds.size()-1);
            return;
        }
        for(int j=0;j<graph[i].length;j++){
            ds.add(i);
            dfs(graph,graph[i][j],ans,ds);
            ds.remove (ds.size ()-1);
        }
    }
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> ans=new ArrayList<>();
        dfs(graph,0,ans,new ArrayList <>());
        return ans;
    }
}