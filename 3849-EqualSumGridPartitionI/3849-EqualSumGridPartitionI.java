// Last updated: 8/7/2025, 2:43:15 PM
class Solution {
    boolean find(int[]row,int col[],int rowSum,int colSum,int m,int n){
        int left=0;
        for(int i=0;i<m-1;i++){
            left+=row[i];
            if(left == (rowSum - left)) return true;
        }
        left=0;
        for(int i=0;i<n;i++){
            left+=col[i];
            if(left==(colSum - left)) return true;
        }
        return false;
    }
    public boolean canPartitionGrid(int[][] grid) {
        int m=grid.length,n=grid[0].length;
        int rowSum=0,colSum=0;
        int row[]=new int[m];
        int col[]=new int[n];
        for(int i=0;i<m;i++){
            int sum=0;
            for(int j=0;j<n;j++){
                sum+=grid[i][j];
            }
            row[i]=sum;
            rowSum+=sum;
        }
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=0;j<m;j++){
                sum+=grid[j][i];
            }
            col[i]=sum;
            colSum+=sum;
        }
        return find(row,col,rowSum,colSum,m,n);
        //return true;
        
    }
}




