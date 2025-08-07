// Last updated: 8/7/2025, 2:43:02 PM
class Solution {
    int ans=0;
    long find(List<List<int[]> >adjList,int src,int parent,int cost[]){
        long max=0,freq=0;
        for(int[]child : adjList.get (src)){
            if(child[0]==parent) continue;
           // System.out.println ("S"+src+" "+child[0]);
            long val = find(adjList,child[0],src,cost);
           // System.out.println (val);
            if(max==0){
                max = val;
                freq=1;
            }
            else if(max==val){
                freq++;
            }else{
                if(val>max){
                    ans+=freq;
                    max=val;
                    freq=1;
                }else{
                    ans++;
                }
            }
        }
        return max+cost[src];
    }
    public int minIncrease(int n, int[][] edges, int[] cost) {
        List<List<int[]>> adjList = new ArrayList <>();
        for(int i=0;i<n;i++){
            adjList.add (new ArrayList <>());
        }
        for(int i[]:edges){
            adjList.get (i[0]).add(new int[]{i[1],cost[i[1]]});
            adjList.get (i[1]).add(new int[]{i[0],cost[i[0]]});
        }
        long a=find(adjList,0,-1,cost);
        System.out.println (a);    
        return ans;
    }
}