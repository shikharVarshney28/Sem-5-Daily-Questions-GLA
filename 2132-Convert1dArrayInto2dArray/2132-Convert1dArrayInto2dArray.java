// Last updated: 8/7/2025, 2:48:42 PM
class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        if(m*n!=original.length) return new int[0][1];
        int [][] nums=new int[m][n];
        int idx=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                nums[i][j]=original[idx++];
            }
        }
        return nums;
    }
}