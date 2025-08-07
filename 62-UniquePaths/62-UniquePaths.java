// Last updated: 8/7/2025, 3:00:04 PM
class Solution {
    int count=0;
    int helper(int st,int end,int row,int col,int arr[][])
    {
        if(row>st || col>end) return 0;
        if(row==st && col==end){
            return 1;
        }
        if(arr[row][col]!=0) return arr[row][col];
        int right=helper(st,end,row,col+1,arr);
        int down=helper(st,end,row+1,col,arr);
        return arr[row][col]=right+down;

    }
    public int uniquePaths(int m, int n) {
        int arr[][]=new int[m][n];
        //Arrays.fill(arr,-1);
        return helper(m-1,n-1,0,0,arr);
        
    }
}