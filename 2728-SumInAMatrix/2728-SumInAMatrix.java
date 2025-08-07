// Last updated: 8/7/2025, 2:46:17 PM
class Solution {
    public int matrixSum(int[][] arr) {
        int sum=0;
        for(int[]rows:arr) Arrays.sort(rows);
        for(int j=0;j<arr[0].length;j++)
        {
            int Max=0;
            for(int i=0;i<arr.length;i++)
                Max=(int)Math.max(Max,arr[i][j]);
            System.out.println(sum+" "+Max);
            sum+=Max;
        }
        return sum;
    }
}