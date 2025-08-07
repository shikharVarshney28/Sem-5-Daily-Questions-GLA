// Last updated: 8/7/2025, 2:56:23 PM
class Solution {
    int max=0;
    int find(int [][]arr,int i,int j,int [][]isVisisted,int val){
        if(i>=arr.length || j>=arr[0].length || i<0 || j<0 ) return 0;
        if(val>=arr[i][j]) return 0;
        if(isVisisted [i][j]!=0) return isVisisted [i][j];
        int path=Math.max (Math.max (
        find(arr,i+1,j,isVisisted,arr[i][j]),
        find(arr,i-1,j,isVisisted,arr[i][j])),
        Math.max(find(arr,i,j+1,isVisisted,arr[i][j]),
        find(arr,i,j-1,isVisisted,arr[i][j])))+1;
        max=Math.max (max,path);
        return isVisisted [i][j]=path;
    }
    public int longestIncreasingPath(int[][] matrix) {
        int m=matrix.length,n=matrix[0].length;
        int isVisisted [][]=new int [m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++) find(matrix,i,j,isVisisted,Integer.MIN_VALUE);
        }
        return max;
    }
}