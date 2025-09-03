// Last updated: 9/3/2025, 10:45:17 AM
class Solution {
    int dp[][][];
    int mod = (int) Math.pow(10, 9) + 7;

    int find(int[][] grid, int r, int c, int dir) {
        if (r >= grid.length || c >= grid[0].length || r < 0 || c < 0)
            return 0;
        if (r == grid.length - 1 && c == grid[0].length - 1)
            return 1;
        if (dp[r][c][dir] != -1)
            return dp[r][c][dir];
        int ans = 0;
        if (grid[r][c] == 0) {
            ans += (find(grid, r + 1, c, 1) % mod + find(grid, r, c + 1, 2) % mod) % mod;
        } else
            ans += (dir == 1 ? find(grid, r, c + 1, 2) % mod : find(grid, r + 1, c, 1) % mod);
        return dp[r][c][dir] = ans % mod;
    }

    public int uniquePaths(int[][] grid) {
        dp = new int[grid.length][grid[0].length][3];
        for (int i[][] : dp)
            for (int j[] : i)
                Arrays.fill(j, -1);
        return find(grid, 0, 0, 1);
    }
}