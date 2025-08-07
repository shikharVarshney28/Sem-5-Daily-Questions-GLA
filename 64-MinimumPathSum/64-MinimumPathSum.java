// Last updated: 8/7/2025, 3:00:01 PM
class Solution {
    int pathz(int [][]grid,int row,int col,int st,int end,int sum,int [][]dp)
    {
        if(row>st || col>end){
            return Integer.MAX_VALUE;
        }
        if(row==st && col==end)
        {
            return grid[row][col];
            
        }
        if(dp[row][col]!=0) return dp[row][col];
        int r=pathz(grid,row,col+1,st,end,sum+grid[row][col],dp);
        int d=pathz(grid,row+1,col,st,end,sum+grid[row][col],dp);
        return dp[row][col]=grid[row][col]+Math.min(r,d);
    }
    public int minPathSum(int[][] grid) {
        int dp[][]=new int[grid.length][grid[0].length];
        return pathz(grid,0,0,grid.length-1,grid[0].length-1,0,dp);
       // return minPath;
    }
}