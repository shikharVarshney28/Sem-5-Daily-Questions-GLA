// Last updated: 8/7/2025, 2:50:10 PM
class Solution {
    public int diagonalSum(int[][] mat) {
        int pri_sum=0,sec_sum=0,cols=mat[0].length;
        for(int i=0;i<mat.length;i++)
        {
            pri_sum+=mat[i][i];
            sec_sum+=mat[i][cols-i-1];
        }
        if(cols%2!=0) sec_sum=sec_sum-mat[cols/2][cols/2];
        return pri_sum+sec_sum;

    }
}