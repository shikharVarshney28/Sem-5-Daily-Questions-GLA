// Last updated: 8/7/2025, 2:52:15 PM
class Solution {
    void find(List<List<Integer>>adjList,int src,int mask,int[]ans,int []io,int n,int notToBeTaken[]){
        
        Queue<Integer>qu=new LinkedList<>();
        qu.add(src);
        while(!qu.isEmpty()){
            //chose any pot 
            int t=qu.poll();
            int i;
            for(i=1;i<=4;i++){
                if((notToBeTaken[t]^(1<<i))<notToBeTaken[t]) continue;
                break;
            }
            ans[t]=i;
            for(int child:adjList.get(t)){
                if(ans[child]!=0) continue;
                //inform all neighbours not to take this pot
                notToBeTaken[child] = notToBeTaken[child] | (1<<i);
                io[child]--;
                if(io[child]==0){
                    qu.add(child);
                } 
            }
        }
    }
    public int[] gardenNoAdj(int n, int[][] edges) {
        List<List<Integer>> adjList=new ArrayList<>();
        for(int i=0;i<n;i++){
            adjList.add(new ArrayList<>());
        }
        for(int edge[]:edges){
            adjList.get(edge[0]-1).add(edge[1]-1);
            adjList.get(edge[1]-1).add(edge[0]-1);
        }
        int ans[]=new int[n];
        int notToBeTaken[]=new int[n];
        int io[] = new int[n];
        for(int i=0;i<n;i++) io[i]=adjList.get(i).size();
        for(int i=0;i<n;i++){
            if(ans[i]==0)
            find(adjList,i,0,ans,io,n,notToBeTaken);
        } 
        return ans;
    }
}