// Last updated: 8/7/2025, 2:54:06 PM
class Solution {
    int dir[][]={{-1,0},{1,0},{0,-1},{0,1}};
    int dfs(int[][] grid,boolean vis[][],int i,int j){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || vis[i][j] || grid[i][j]==0) return 0;
        vis[i][j]=true;
        int ans=0;
        int l = dfs(grid,vis,i,j-1);
        int r = dfs(grid,vis,i,j+1);
        int u = dfs(grid,vis,i-1,j);
        int d = dfs(grid,vis,i+1,j);
        return l+r+u+d+1;
    }
    public int maxAreaOfIsland(int[][] grid) {
        Queue<int[]>qu=new LinkedList<>();
        int maxArea = 0;
        boolean vis[][]=new boolean[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(!vis[i][j] && grid[i][j]==1){
                    int val = dfs(grid,vis,i,j);
                    maxArea = Math.max(maxArea , val);
                    //System.out.println(i+" "+j+" "+val);
                }
            }
        }
        return maxArea;
    }
}