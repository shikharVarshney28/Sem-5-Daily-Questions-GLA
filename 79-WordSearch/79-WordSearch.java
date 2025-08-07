// Last updated: 8/7/2025, 2:59:43 PM
class Solution {
    public boolean find(char [][] board,int idx,int row,int col,boolean [][] check,String word,String ans){
        if(idx>=word.length()){
            System.out.println (ans);
            return true;
        }
        if(row>=board.length || row<0 || col>=board[0].length || col<0) return false;
        if(word.charAt(idx)!=board[row][col]) return false ;
        if(check[row][col]) return false;
        check[row][col]=true;
        if (find(board,idx+1,row,col+1,check,word,ans+word.charAt(idx)) ||
        find(board,idx+1,row+1,col,check,word,ans+word.charAt(idx))||
        find(board,idx+1,row-1,col,check,word,ans+word.charAt(idx)) ||
        find(board,idx+1,row,col- 1,check,word,ans+word.charAt(idx))) return true;
        check[row][col]=false;
        return false;
    }
    public boolean exist(char[][] board, String  word) {
        char ch=word.charAt(0);
        int row=-1,col=-1;
        ArrayList<Integer> a=new ArrayList <>();
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(ch==board[i][j] ){
                    a.add(i);
                    a.add(j);
                }
            }
        }
        for(int i=0;i<a.size();i+=2){
            boolean check[][]=new boolean[board.length][board[0].length];
            if(find(board,0,a.get(i),a.get(i+1),check,word,"")) return true;
        }








        return false ;
    }
}