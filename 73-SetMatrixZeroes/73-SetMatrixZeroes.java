// Last updated: 8/7/2025, 2:59:51 PM
class Solution {
    public void setZeroes(int[][] matrix) {
        ArrayList<Integer> a=new ArrayList<>();
        int row=matrix.length,col=matrix[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j]==0){
                    a.add(i);
                    a.add(j);
                }
            }
        }
        for(int i=0;i<a.size();i+=2){
            int Row=a.get(i),Col=a.get(i+1);
            for(int j=0;j<col;j++) matrix[Row][j]=0;
            for(int j=0;j<row;j++) matrix[j][Col]=0;
        }
       
    }
}