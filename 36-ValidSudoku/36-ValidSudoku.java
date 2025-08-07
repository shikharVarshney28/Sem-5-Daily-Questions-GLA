// Last updated: 8/7/2025, 3:00:42 PM
class Solution {
    boolean check(char [][] board,int row,int col,char numb)
    {
        for(int i=0;i<9;i++)
        {
           
            if(board[row][i]==numb) return false;
        }
        for(int i=0;i<9;i++)
        {
            
            if(board[i][col]==numb) return false;
        }
        int st_row=row/3*3,st_col=col/3*3;
        for(int i=st_row;i<st_row+3;i++)
        {
            for(int j=st_col;j<st_col+3;j++)
            {
                if(board[i][j]==numb){
                    
                     return false;
                }
            }
        }
        return true;
    }
    
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                if(board[i][j]=='.') continue;
                char numb=board[i][j];
                board[i][j]='.';
                if(check(board,i,j,numb)==false){
                     return false;
                }
                board[i][j]=numb;
            }
        }
        return true;
    }
}