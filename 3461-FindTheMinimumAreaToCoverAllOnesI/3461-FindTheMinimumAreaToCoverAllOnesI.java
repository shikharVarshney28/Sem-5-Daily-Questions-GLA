// Last updated: 8/7/2025, 2:44:40 PM
class Solution {
    public int minimumArea(int[][] grid) {
        int minR=grid.length,minC=grid[0].length,maxR=0,maxC=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    minR= Math.min (minR,i);
                    minC=Math.min (minC,j);
                    maxR=Math.max(maxR,i);
                    maxC=Math.max (maxC,j);
                }
            }
        }
        int length = maxR-minR ==0 ? 1 : maxR - minR+1;
        int breadth = maxC - minC ==0 ? 1: maxC - minC+1;
        return length * breadth;
        
    }
}