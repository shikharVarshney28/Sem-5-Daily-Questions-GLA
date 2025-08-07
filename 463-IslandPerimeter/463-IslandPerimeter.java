// Last updated: 8/7/2025, 2:55:20 PM
class Solution {
    int perimeter = 0;

    int dfs(int[][] grid, int r, int c, int m, int n, boolean isVisisted[][]) {
        if (r >= m || c >= n || c < 0 || r < 0)
            return 1;
        if (grid[r][c] == 0)
            return 1;
        if (isVisisted[r][c])
            return 0;
        isVisisted[r][c] = true;
        perimeter = (dfs(grid, r, c + 1, m, n, isVisisted) + dfs(grid, r, c - 1, m, n, isVisisted)
                + dfs(grid, r + 1, c, m, n, isVisisted) + dfs(grid, r - 1, c, m, n, isVisisted));
        return perimeter;

    }

    public int islandPerimeter(int[][] grid) {
        int i = -1, j = -1, m = grid.length, n = grid[0].length;
        for (int row = 0; row < m; row++) {
            for (int col = 0; col < n; col++) {
                if (grid[row][col] == 1) {
                    i = row;
                    j = col;
                }
            }
            if (i != -1 && j != -1)
                break;
        }
        boolean isVisisted[][] = new boolean[m][n];
        return dfs(grid, i, j , m, n, isVisisted);
        // return perimeter;
    }
}