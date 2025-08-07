// Last updated: 8/7/2025, 2:46:12 PM
class Solution {
    int direction[][]={{0,1},{0,-1},{1,0},{-1,0}};
    int bfs(int [][]grid,int row,int col,int m,int n,boolean [][] vis){
        int ans=0;
        Queue<int []>qu=new LinkedList<>();
        qu.add (new int[]{row,col});
        while(!qu.isEmpty ()){
            int temp[]=qu.poll();
            ans+=grid[temp[0]][temp[1]];
            for(int dir[]:direction){
                int r=temp[0]+dir[0],c=temp[1]+dir[1];
                if(r<0 || c<0 || r>=m || c>=n || grid[r][c]==0 || vis[r][c]) continue;
                vis[r][c]=true;
                qu.add (new int []{r,c});
            }
        }
        //vis=new boolean[m][n];
        return ans;
    }
    public int findMaxFish(int[][] grid) {
        int ans=0;
        int m=grid.length,n=grid[0].length;
        boolean vis[][]=new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]!=0){
                    vis[i][j]=true;
                    ans=Math.max (ans,bfs(grid,i,j,m,n,vis));
                }
            }
        }
        return ans;
    }
}