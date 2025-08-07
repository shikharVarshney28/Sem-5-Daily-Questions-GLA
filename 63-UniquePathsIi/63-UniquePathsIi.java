// Last updated: 8/7/2025, 3:00:02 PM
class Solution {
    int count=0;
    int path(int [][] grid,int row,int col,int endr,int endc,int [][]dp)
    {
        if(row>endr || col>endc) return 0;
        if(grid[row][col]==1) return 0;
        if(row==endr && col==endc) {
            return 1;
        }
        if(dp[row][col]!=0) return dp[row][col];
        // Right
        int right =path(grid,row,col+1,endr,endc,dp );
        // Down
        int down=path(grid,row+1,col,endr,endc,dp);
        return dp[row][col]=right +down;
        
    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int endr=obstacleGrid.length,endc=obstacleGrid[0].length;
        int dp[][]=new int[endr][endc];
        return path(obstacleGrid,0,0,endr-1,endc-1,dp);
        //return count;
    }
}