// Last updated: 11/19/2025, 12:33:28 PM
class Solution {
    Integer[][][] dp;

    int find(int[][] grid, int i, int j, int k) {
        //System.out.println(i+" "+j+" "+k);
        if (i >= grid.length || j >= grid[0].length || k < 0)
            return Integer.MIN_VALUE;
        if (i == grid.length - 1 && j == grid[0].length - 1) {
            if (k == 0) {
                return grid[i][j] == 0 ? grid[i][j] : Integer.MIN_VALUE;
            }
            return grid[i][j];
        }
        if (dp[i][j][k] != null)
            return dp[i][j][k];
        // System.out.println(i+" "+j+" "+k);
        return dp[i][j][k] = Math.max(find(grid, i, j + 1, k - (grid[i][j] == 0 ? 0 : 1)),
                find(grid, i + 1, j, k - (grid[i][j] == 0 ? 0 : 1))) + grid[i][j];
    }

    public int maxPathScore(int[][] grid, int k) {
        dp = new Integer[grid.length][grid[0].length][k + 1];
        return Math.max(find(grid, 0, 0, k), -1);
    }
}