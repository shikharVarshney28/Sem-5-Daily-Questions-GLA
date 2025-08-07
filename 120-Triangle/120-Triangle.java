// Last updated: 8/7/2025, 2:58:58 PM
class Solution {
    int dp[][];
    int find(List<List<Integer>> a,int row,int col){
        if(row>=a.size()) return 0;
        if(dp[row][col]!=-1) return dp[row][col];
        return  dp[row][col]=Math.min(find(a,row+1,col),find(a,row+1,col+1))+a.get(row).get(col);
    }
    public int minimumTotal(List<List<Integer>> triangle) {
        dp=new int[triangle.size()][201];
        for(int i[]:dp)
        Arrays.fill (i,-1);
        return find(triangle,0,0);
    }
}