// Last updated: 8/7/2025, 2:47:38 PM
class Solution {
    boolean check(int row,int n,int col,int[][]grid){
        //col 1
        int idx=0;
        for(int i=0;i<n;i++){
            if(grid[row][i] != grid[i][col]) return false;
        }
        return true;
    }
    public int equalPairs(int[][] grid) {
        // lets iterate via a first row
        int row=0,count=0;
        while(row<grid.length){
            int j=0;
            for(int i=0;i<grid.length;i++){
                if(check(row,grid.length,i,grid)){
                    count++;
                }
            }
            row++;
        }
        return count;
    }
}