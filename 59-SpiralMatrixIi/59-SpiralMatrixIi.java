// Last updated: 8/7/2025, 3:00:08 PM
class Solution {
    public int[][] generateMatrix(int n) {
        int [][] arr=new int[n][n];
        int minR=0,minC=0,maxR=n-1,maxC=n-1;
        int count=1,te=n*n;
        while(count<=te){
            // Left to Right
            for(int i=minC;i<=maxC && count<=te;i++) arr[minR][i]=count++;
            minR++;
            // Up to down
            for(int i=minR;i<=maxR && count<=te;i++) arr[i][maxC]=count++;
            maxC--;
            // Right to left
            for(int i=maxC; i>= minC && count<=te;i--) arr[maxR][i]=count++;
            maxR--;
            //Down to Up
            for(int i=maxR;i>=minR && count<=te;i--) arr[i][minC]=count++;
            minC++;
        }
        return arr;

    }
}