// Last updated: 9/29/2025, 7:29:48 PM
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length, n = matrix[0].length;
        int st = 0, end = m * n - 1;

        while (st <= end) {
            int mid = (st + end) / 2;
            if (matrix[mid / n][mid % n] == target)  // row mwh col ka dive and col meh row ka divide to get index of 2d array
                return true;
            if (matrix[mid / n][mid % n] > target)
                end--;
            else
                st++;
        }
        return false;
    }
}