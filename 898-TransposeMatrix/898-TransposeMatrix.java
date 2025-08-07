// Last updated: 8/7/2025, 2:53:09 PM
class Solution {
    void swap(int [][] mat,int i,int j)
    {
        int temp=mat[i][j];
        mat[i][j]=mat[j][i];
        mat[j][i]=temp;
    }
    public int[][] transpose(int[][] matrix) {
        int[][]matrixb=new int[matrix[0].length][matrix.length];
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
                {
                    matrixb[j][i]=matrix[i][j];
                }
        }
        return matrixb;
    }
}