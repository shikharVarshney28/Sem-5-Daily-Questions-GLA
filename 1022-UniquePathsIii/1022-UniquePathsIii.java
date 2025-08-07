// Last updated: 8/7/2025, 2:52:36 PM
class Solution {
    private void findAllPaths(int[][] grid, int startRow, int startCol, int endRow, int endCol, boolean[][] isVisited,String s,int count,int path[]) {
        if(startRow>endRow || startRow<0 || startCol>endCol || startCol<0 || grid[startRow][startCol]==-1) return;
        if(grid[startRow][startCol]==2){
            if(s.length()==count) path[0]++;
            return;
        }
        if(isVisited[startRow][startCol]) return;
        isVisited[startRow][startCol]=true;
        //Right
        findAllPaths(grid, startRow, startCol+1, endRow, endCol, isVisited, s+"R",count,path);
        //Left
        findAllPaths(grid, startRow, startCol-1, endRow, endCol, isVisited, s+"L",count,path);
        // Up
        findAllPaths(grid, startRow-1, startCol, endRow, endCol, isVisited, s+"U",count,path);
        //Down
        findAllPaths(grid, startRow+1, startCol, endRow, endCol, isVisited, s+"D",count,path);
        isVisited[startRow][startCol]=false;
    }
    public int uniquePathsIII(int[][] grid) {
        int startRow=-1,startCol=-1;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    startRow=i;
                    startCol=j;
                    break;
                }
            }
        }
        int count=grid.length*grid[0].length-1;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==-1){
                    count--;
                }
            }
        }
        
        //System.out.println(startRow+" "+startCol);
        boolean isVisited[][]=new boolean[grid.length][grid[0].length];
        int path[]={0};
        findAllPaths(grid,startRow,startCol,grid.length-1,grid[0].length-1,isVisited,"",count,path);
        return path[0];
    }
}