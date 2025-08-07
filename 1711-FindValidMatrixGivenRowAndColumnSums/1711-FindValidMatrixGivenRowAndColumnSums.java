// Last updated: 8/7/2025, 2:50:03 PM
class Solution {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int row=rowSum.length;
        int col=colSum.length;
        int r=0,c=0;
        int [][] arr=new int[row][col];
        while(r<row && c<col)
        {
            int minVal=Math.min(rowSum[r],colSum[c]);
            arr[r][c]=minVal;
            rowSum[r]-=minVal;
            colSum[c]-=minVal;
            if(rowSum[r]==0) r++;   // No more place to place value in that row
            if(colSum[c]==0) c++;   // No more place to place value in that col so move ahead;
        }
        return arr;
    }
}