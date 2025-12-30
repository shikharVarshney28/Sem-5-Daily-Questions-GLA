// Last updated: 12/30/2025, 10:30:51 AM
1class Solution {
2    void dfs(ArrayList<ArrayList<Integer>>arr,int i,boolean [] isVisisted){
3        if(isVisisted[i]) return;
4        isVisisted [i]=true;
5        for(int neighbour:arr.get (i)){
6            if(!isVisisted [neighbour]){
7                dfs(arr,neighbour,isVisisted);
8            }
9        }
10    }
11    public int findCircleNum(int[][] edges) {
12        int n=edges.length;
13        ArrayList<ArrayList<Integer>> arr=new ArrayList <>();
14        for(int i=0;i<n;i++){
15            arr.add (new ArrayList <>());
16        }
17        for(int i=0;i<n;i++){
18            for(int j=0;j<n;j++){
19                if((i!=j) && (edges[i][j]==1)){
20                    arr.get (i).add(j);
21                }
22            }
23        }
24        boolean isVisisted []=new boolean [n];
25        int ans=0;
26        System.out.println (arr);
27        for(int i=0;i<n;i++){
28            if(!isVisisted [i]){
29                dfs(arr,i,isVisisted);
30                ans++;
31            }
32        }
33        return ans;
34    }
35}