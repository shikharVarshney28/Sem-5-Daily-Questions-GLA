// Last updated: 8/7/2025, 2:54:44 PM
class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int m = mat.length, n = mat[0].length;
        Queue<int[]> qu = new LinkedList<>();
        boolean vis[][] = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 0) {
                    vis[i][j] = true;
                    qu.add(new int[] { i, j });
                }
            }
        }
        int directions[][] = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };
        while (!qu.isEmpty()) {
            int size = qu.size();
            for (int i = 0; i < size; i++) {
                int t[] = qu.poll();
                // add neigh
                for (int dir[] : directions) {
                    int row = dir[0] + t[0], col = dir[1] + t[1];
                    if (row < 0 || col < 0 || row >= m || col >= n || vis[row][col])
                        continue;
                    vis[row][col] = true;
                    mat[row][col] += mat[t[0]][t[1]];
                    qu.add(new int[] { row, col });
                }
            }

        }
        return mat;
    }
}