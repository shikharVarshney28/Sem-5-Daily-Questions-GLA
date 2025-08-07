// Last updated: 8/7/2025, 2:46:50 PM
class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int m=grid.length,n=grid[0].length;
        int row[][]=new int[m][2], col[][]=new int[n][2];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                row[i][grid[i][j]/1]++;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                col[i][grid[j][i]/1]++;
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                grid[i][j] = (row[i][1] - row[i][0]) + (col[j][1] - col[j][0]);
            }
        }
        return grid;
    }
}