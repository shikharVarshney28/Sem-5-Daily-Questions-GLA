// Last updated: 8/7/2025, 2:47:55 PM
class Solution {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        char arr[][] =new char[m][n];
        for(int [] g: guards){
            arr[g[0]][g[1]]='G';
        }
        for(int [] w: walls){
            arr[w[0]][w[1]]='W';
        }
        int count=0;
        for(int [] g:guards){
            int row=g[0],col=g[1];
            for(int i=col+1;i<n;i++){
                if(arr[row][i]!='W' && arr[row][i]!='G'){
                    if(arr[row][i]!='V')
                        count++;
                    arr[row][i]='V';
                    
                }else break;
            }
            for(int i=col-1;i>=0;i--){
                if(arr[row][i]!='W' && arr[row][i]!='G'){
                    if(arr[row][i]!='V')
                        count++;
                    arr[row][i]='V';
                    
                }else break;
            }
            for(int i=row+1;i<m;i++){
                if(arr[i][col]!='W' && arr[i][col]!='G'){
                    if(arr[i][col]!='V')
                        count++;
                    arr[i][col]='V';
                    
                }else break;
            }
            for(int i=row-1;i>=0;i--){
                if(arr[i][col]!='W' && arr[i][col]!='G'){
                    if(arr[i][col]!='V')
                        count++;
                    arr[i][col]='V';
                    
                }else break;
            }
        }
        return m*n-count-guards.length-walls.length;
    }
}