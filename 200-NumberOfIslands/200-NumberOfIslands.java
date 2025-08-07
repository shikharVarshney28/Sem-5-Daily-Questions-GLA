// Last updated: 8/7/2025, 2:57:44 PM
class Solution {
    void dfs(char [][]grid,int row,int col,boolean [][]isVisisted){
        if(row<0 || col<0 || row>=grid.length || col>=grid[0].length) return;
        if(isVisisted [row][col] || grid[row][col]=='0') return;
        isVisisted [row][col]=true;
        dfs(grid,row+1,col,isVisisted);
        dfs(grid,row-1,col,isVisisted);
        dfs(grid,row,col+1,isVisisted);
        dfs(grid,row,col-1,isVisisted);
    }
    public int numIslands(char[][] grid) {
        boolean isVisisted [][]=new boolean[grid.length][grid[0].length];
        int ans=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1' && !isVisisted [i][j]){
                    //isVisisted [i][j]=true;
                    dfs(grid,i,j,isVisisted);
                    ans++;
                }
            }
        }
        return ans;
    }
}