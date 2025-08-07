// Last updated: 8/7/2025, 2:49:27 PM
class Solution {
    public int[][] highestPeak(int[][] isWater) {
        int m = isWater.length, n = isWater[0].length;
        boolean isVis[][] = new boolean[m][n];
        Queue<int[]> qu = new LinkedList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (isWater[i][j] == 1) {
                    isWater[i][j] = 0;
                    isVis[i][j] = true;
                    qu.add(new int[] { 0, i, j });
                }
            }
        }
        int direction[][] = { { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 } };
        while (!qu.isEmpty()) {
            int temp[] = qu.poll();
            isWater[temp[1]][temp[2]] = temp[0];
            for (int dir[] : direction) {
                int row = temp[1] + dir[0], col = temp[2] + dir[1];
                if (row >= m || col >= n || row < 0 || col < 0 || isVis[row][col])
                    continue;
                isWater[row][col] = temp[0] + 1;
                isVis[row][col] = true;
                qu.add(new int[] { temp[0] + 1, row, col });
            }
        }
        return isWater;
    }
}
