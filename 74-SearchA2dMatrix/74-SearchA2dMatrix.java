// Last updated: 8/7/2025, 2:59:49 PM
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int st=0,end=matrix.length*matrix[0].length-1,col=matrix[0].length;
        while(st<=end)
        {
            int mid = st + (end -st)/2;
            if(matrix[mid/col][mid%col]==target) return true;
            else if(matrix[mid/col][mid%col]<target) st++;
            else end--;
        }
        return false;
    }
}