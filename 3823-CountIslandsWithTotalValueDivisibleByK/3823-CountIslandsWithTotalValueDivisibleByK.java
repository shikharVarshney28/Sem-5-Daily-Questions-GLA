// Last updated: 8/7/2025, 2:43:26 PM
class Solution {
    int dir[][] = { { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 } };

    boolean find(int[][] grid, int i, int j, boolean used[][], int k, int m, int n) {
        Queue<int[]> qu = new LinkedList<>();
        int ans = 0;
        qu.add(new int[] { i, j });
        used[i][j] = true;
        while (!qu.isEmpty()) {
            int t[] = qu.poll();
            ans += grid[t[0]][t[1]];
            for (int d[] : dir) {
                int nr = d[0] + t[0], nc = d[1] + t[1];
                if (nr >= m || nc >= n || nr < 0 || nc < 0 || used[nr][nc] || grid[nr][nc] == 0)
                    continue;
                qu.add(new int[] { nr, nc });
                used[nr][nc] = true;
            }
        }
        //System.out.println (i+" "+j+" "+ans);
        return ans % k == 0;
    }

    public int countIslands(int[][] grid, int k) {
        int m = grid.length, n = grid[0].length;
        boolean used[][] = new boolean[m][n];
        int ans = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (!used[i][j] && grid[i][j] >= 1 && find(grid, i, j, used, k, m, n))
                    ans++;
            }
        }
        return ans;
    }
}