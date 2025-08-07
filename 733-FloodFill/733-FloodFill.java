// Last updated: 8/7/2025, 2:53:57 PM
class Solution {
    void fill(int [][]image,int row,int col,int val,int m,int n,boolean [][] isVisisted ,int color){
        if(row>= m || col>=n || row<0 || col<0){
            return;
        }
        if(image[row][col]!=val) return ;
        if(isVisisted[row][col]) return;
        isVisisted [row][col]=true;
        image[row][col]=color;
        fill(image,row-1,col,val,m,n,isVisisted,color);
        fill(image,row+1,col,val,m,n,isVisisted,color);
        fill(image,row,col+1,val,m,n,isVisisted,color);
        fill(image,row,col-1,val,m,n,isVisisted,color);

    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int m=image.length,n=image[0].length;
        boolean isVisisted [][]=new boolean[m][n];
        int val=image[sr][sc];
        fill(image,sr,sc ,val,m,n,isVisisted,color);
        return image;
    }
}