// Last updated: 8/7/2025, 3:00:21 PM
class Solution {
    int count=0;
    boolean isSafe(char [][]board,int row,int col)
    {
        int n=board.length;
        for(int i=0;i<board.length;i++){
            if(board[row][i]=='Q') return false;
        }
        for(int i=0;i<board.length;i++)
        {
            if(board[i][col]=='Q') return false;
        }
        int i=row,j=col;
        while(i>=0 && j<n){
            if(board[i][j]=='Q') return false;
            i--;j++;
        }
        i=row;j=col;
        while(i>=0 && j>=0){
            if(board[i][j]=='Q') return false;
            i--;j--;
        }
        i=row;j=col;
        while(i<n && j<n){
            if(board[i][j]=='Q') return false;
            i++;j++;
        }
        i=row;j=col;
        while(i<n && j>=0)
        {
            if(board[i][j]=='Q') return false;
            i++;j--;
        }
        return true;
    }
    void helper(char [][] board,int row)
    {
        if(row==board.length)
        {
            // for(int k=0;k<board.length;k++){
            //     for(int j=0;j<board.length;j++) System.out.print(board[k][j]+" ");
            //     System.out.println();
            // }
            // System.out.println();
            count++;
            return;
        }
        for(int i=0;i<board.length;i++)
        {
            if(isSafe(board,row,i)){
                board[row][i]='Q';
                helper(board,row+1);
                board[row][i]='X';
            }
        }
    }
    public int totalNQueens(int n) {
        char [][]board=new char[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++) board[i][j]='X';
        }
        helper(board,0);
        return count;
    }
}