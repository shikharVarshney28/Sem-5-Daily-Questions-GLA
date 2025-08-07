// Last updated: 8/7/2025, 3:00:26 PM
class Solution {
    public void rotate(int[][] arr) {
       //TransPOse
       int n=arr.length;
       int brr[][]=new int[n][n];
       for(int i=0;i<arr.length;i++)
       {
        for(int j=0;j<arr.length;j++)
            brr[i][j]=arr[j][i];
       }
       for(int i=0;i<n;i++)
       {
        for(int j=0;j<n;j++) arr[i]=brr[i];
       }
       int start=0,end=n-1;
       //Now swapping wrt rows 
       while(start<end)
       {
        for(int i=0;i<n;i++){
            int temp=arr[i][end];
            arr[i][end]=arr[i][start];
            arr[i][start]=temp;
        }
        start++;end--;
       }
        
    }
}