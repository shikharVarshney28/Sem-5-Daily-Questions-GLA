// Last updated: 8/7/2025, 2:48:36 PM
class Solution {
    public long gridGame(int[][] grid) {
        long row = 0, col = 0, ans = 0;
        for (int i = 0; i < grid[0].length; i++)
            row += grid[0][i];
        ans = row = row - grid[0][0];
        int idx = 0;
        for (int i = 1; i < grid[0].length; i++) {
            row -= grid[0][i];
            col += grid[1][i - 1];
            System.out.println(ans);
            ans = Math.min(Math.max(row, col), ans);
        }
        return ans;
    }
}