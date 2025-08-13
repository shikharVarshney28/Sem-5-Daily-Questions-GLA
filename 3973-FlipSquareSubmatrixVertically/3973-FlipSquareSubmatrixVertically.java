// Last updated: 8/13/2025, 10:48:33 AM
class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        int lastRow = x + k - 1;
        for (int i = x; i < lastRow; i++) {
            for (int j = y; j < y + k; j++) {
                int temp = grid[i][j];
                grid[i][j] = grid[lastRow][j];
                grid[lastRow][j] = temp;
            }
            lastRow--;
        }
        return grid;
    }
}