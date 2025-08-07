// Last updated: 8/7/2025, 3:00:40 PM
class Solution {
    boolean find(char[][] board, int i, int j) {
        if (i >= 9)
            return true;
        boolean f = false;
        if (board[i][j] != '.') {
            if (j < 8)
                f = find(board, i, j + 1);
            else
                f = find(board, i + 1, 0);
        } else {
            for (char n = '1'; n <= '9'; n++) {
                if (isValid(board, i, j, n)) {
                    
                    board[i][j] = n;
                    
                    if (j < 8)
                        f = find(board, i, j + 1);
                    else
                        f = find(board, i + 1, 0);
                    if (f)
                        return true;
                    board[i][j] = '.';
                }
            }
        }
        return f;
    }

    public void solveSudoku(char[][] board) {
        find(board, 0, 0);
    }

    boolean isValid(char[][] arr, int row, int col, char n) {
        for (int i = 0; i < 9; i++) {
            if (arr[i][col] == n)
                return false;
        }
        for (int i = 0; i < 9; i++) {
            if (arr[row][i] == n)
                return false;
        }
        int r = row / 3 * 3, c = col / 3 * 3;
        for (int i = r; i < r + 3; i++) {
            for (int j = c; j < c + 3; j++) {
                if (arr[i][j] == n)
                    return false;
            }
        }
        return true;
    }
}