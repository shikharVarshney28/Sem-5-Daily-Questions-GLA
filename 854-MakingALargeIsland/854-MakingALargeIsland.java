// Last updated: 8/7/2025, 2:53:22 PM
class Solution {
    public int largestIsland(int[][] grid) {
        int color=2;
        HashMap<Integer,Integer> hmap=new HashMap<>();
        int n=grid.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]>=2 || grid[i][j]==0) continue;
                int m=dfs(grid,i,j,n,color);
                hmap.put (color,m);
                color++;
            }
        }
        int ans=1;
        //if(hmap.size()==0) return 1;
        int direction[][]={{-1,0},{1,0},{0,1},{0,-1}};
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                List<Integer> vis=new
ArrayList<>();
                if(grid[i][j]==0){
                    int cell=0;
                    for(int dir[]:direction){
                        int row=i+dir[0],col=j+dir[1];
                        if(row>=n || col>=n || row<0 || col<0|| grid[row][col]==0 || vis.contains(grid[row][col])) continue;
                        cell+=hmap.get(grid[row][col]);
                        vis.add(grid[row][col]);
                    }
                    ans=Math.max(ans,cell+1);
                }else ans=Math.max(ans,hmap.get (grid[i][j]));
            }

        }
        return ans;
    }
    int dfs(int grid[][],int row,int col,int n,int color){
        if(row>=n || col>=n || row<0 || col<0 || grid[row][col]>=2 || grid[row][col]==0) return 0;
        grid[row][col]=color;
        return dfs(grid,row,col+1,n,color)+dfs(grid,row,col-1,n,color)+dfs(grid,row+1,col,n,color)+dfs(grid,row-1,col,n,color)+1;
    }
}