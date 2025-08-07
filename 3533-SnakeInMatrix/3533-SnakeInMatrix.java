// Last updated: 8/7/2025, 2:44:24 PM
class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int m[][]=new int[n][n];
        int num=0;
       for(int i=0;i<n;i++){
           for(int j=0;j<n;j++){
               m[i][j]=num++;
               }
          }
        int i=0,j=0;
        int pointer=m[i][j];
        for(String s:commands)
            {
            if(s.equals("RIGHT")) pointer=m[i][++j];
            else if (s.equals("DOWN")) pointer=m[++i][j];
            else if (s.equals("LEFT")) pointer=m[i][--j];
            else pointer=m[--i][j];
            }
       return pointer;
    }
}