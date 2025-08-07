// Last updated: 8/7/2025, 2:43:53 PM
class Solution {
    public List<Integer> zigzagTraversal(int[][] grid) {
        List<Integer> ans=new ArrayList <>();
        int row=0,col=0,m=grid.length,n=grid[0].length;
        while(row<m){
            for(;col<n;col+=2) ans.add (grid[row][col]);
            row++;
            if(row==m) break;
            col= n%2==0 ? n-1 : n-2;
            for(;col>=0;col-=2){
                ans.add (grid[row][col]);
            }
            row++;
            col=0;
        }
        return ans;
    }
}