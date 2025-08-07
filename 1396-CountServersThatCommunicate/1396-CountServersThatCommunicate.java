// Last updated: 8/7/2025, 2:51:33 PM
class Solution {
    public int countServers(int[][] grid) {
        int ans=0;
        int m=grid.length,n=grid[0].length;
        int row[]=new int[m];
        for(int i=0;i<m;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(grid[i][j]==1) count++;
            }
            if(count>1){
                row[i]=count;
                ans+=count;
            }
        }
        for(int j=0;j<n;j++){
            int diff=0,count=0;
            for(int i=0;i<m;i++){
                if(grid[i][j]==1){
                    count++;
                    if(row[i]!=0) diff++;
                }
            }
            if(count >1){
                ans+=count-diff;
            }
        }
        return ans;
    }
}