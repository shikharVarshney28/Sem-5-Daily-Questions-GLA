// Last updated: 8/28/2025, 11:47:17 AM
class Solution {
    int dir[][]={{1,1},{1,-1},{-1,-1},{-1,1}};
    int dfs(int grid[][],int i,int j,int expected,boolean turnAval,int m,int n,int didx){
        int newI = i+dir[didx][0],newJ = j+dir[didx][1];
        if(newI >= m || newJ >=n || newI<0 || newJ<0 || grid[newI][newJ]!=expected) return 0;
        int maxAns=0;
        //continue on this diagnol given by d
        maxAns =Math.max(maxAns,dfs(grid,newI,newJ,expected == 2 ? 0 : 2,turnAval,m,n,didx));

        //change the dir clockwise since we have maintained the order in dir so it means to move forward in direction array clockwisely
        if(turnAval){
            maxAns = Math.max(maxAns,dfs(grid,newI,newJ,expected == 2 ? 0 : 2,false,m,n,(didx+1)%4));
        }
        return maxAns+1;
    }
    public int lenOfVDiagonal(int[][] grid) {
        int m=grid.length , n=grid[0].length,maxAns=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    //try for all 4 diagnol...
                    for(int d=0;d<4;d++) maxAns = Math.max(dfs(grid,i,j,2,true,m,n,d)+1,maxAns);
                }
            }
        }
        return maxAns;
    }
}