// Last updated: 8/7/2025, 3:00:22 PM
class Solution {
    List<List<String>> ans = new ArrayList<>();

    boolean isSafe(char board[][], int row, int col) {
        int n = board.length;
        for (int i = 0; i < n; i++) {
            if (board[i][col] == 'Q')
                return false;
        }
        for (int i = 0; i < n; i++) {
            if (board[row][i] == 'Q')
                return false;
        }
        int i = row, j = col;
        while (i >= 0 && j >= 0) {
            if (board[i--][j--] == 'Q')
                return false;
        }
        i = row;
        j = col;
        while (i >= 0 && j < n) {
            if (board[i--][j++] == 'Q')
                return false;
        }
        i = row;
        j = col;
        while (i < n && j >= 0) {
            if (board[i++][j--] == 'Q')
                return false;
        }
        i = row;
        j = col;
        while (i < n && j < n) {
            if (board[i++][j++] == 'Q')
                return false;
        }
        return true;
    }

    void placeNQueens(char[][] board, int i) {
        if (i >= board.length) {
            List<String> temp = new ArrayList<>();
            for (int row = 0; row < board.length; row++) {
                StringBuilder res = new StringBuilder();
                for (int j = 0; j < board.length; j++) {
                    res.append(board[row][j]);
                }
                temp.add(res.toString());
            }
            ans.add(temp);
            return;
        }
        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, i, col)) {
                board[i][col] = 'Q';
                placeNQueens(board, i + 1);
                board[i][col] = '.';
            }
        }
    }

    public List<List<String>> solveNQueens(int n) {
        char board[][] = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }
        placeNQueens(board, 0);
        return (ans);
    }
}