// Last updated: 9/29/2025, 10:25:58 AM
class Solution {
    public void setZeroes(int[][] matrix) {
        List<int[]> a = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0)
                    a.add(new int[] { i, j });
            }
        }
        for (int i[] : a) {
            for (int j = 0; j < matrix.length; j++)
                matrix[j][i[1]] = 0;
            for (int j = 0; j < matrix[0].length; j++)
                matrix[i[0]][j] = 0;
        }
    }
}