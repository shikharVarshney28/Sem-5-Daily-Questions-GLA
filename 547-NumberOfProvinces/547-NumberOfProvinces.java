// Last updated: 8/7/2025, 2:54:40 PM
class Solution {
    void dfs(ArrayList<ArrayList<Integer>>arr,int i,boolean [] isVisisted){
        if(isVisisted[i]) return;
        isVisisted [i]=true;
        for(int neighbour:arr.get (i)){
            if(!isVisisted [neighbour]){
                dfs(arr,neighbour,isVisisted);
            }
        }
    }
    public int findCircleNum(int[][] edges) {
        int n=edges.length;
        ArrayList<ArrayList<Integer>> arr=new ArrayList <>();
        for(int i=0;i<n;i++){
            arr.add (new ArrayList <>());
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if((i!=j) && (edges[i][j]==1)){
                    arr.get (i).add(j);
                }
            }
        }
        boolean isVisisted []=new boolean [n];
        int ans=0;
        System.out.println (arr);
        for(int i=0;i<n;i++){
            if(!isVisisted [i]){
                dfs(arr,i,isVisisted);
                ans++;
            }
        }
        return ans;
    }
}