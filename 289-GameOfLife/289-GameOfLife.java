// Last updated: 8/7/2025, 2:56:40 PM
class Solution {
    int dir[][] = { { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 }, { 1, 1 }, { 1, -1 }, { -1, 1 }, { -1, -1 } };

    int find(int[][] arr, int i, int j) {
        int zero = 0, one = 0;
        for (int d[] : dir) {
            int nr = i + d[0], nc = d[1] + j;
            if (nr < 0 || nc < 0 || nr >= arr.length || nc >= arr[0].length)
                continue;
            if (arr[nr][nc] == 0)
                zero++;
            else
                one++;
        }
        if (arr[i][j] == 1) {
            if (one < 2 || one > 3)
                return 0;
            return 1;
        }
        return one == 3 ? 1 : 0;
    }

    public void gameOfLife(int[][] board) {
        int[][] ans = new int[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                ans[i][j] = find(board, i, j);
            }
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                board[i][j] = ans[i][j];
            }
        }
    }
}