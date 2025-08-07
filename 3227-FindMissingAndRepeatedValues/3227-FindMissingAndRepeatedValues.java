// Last updated: 8/7/2025, 2:45:32 PM
class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int sum=0,n=grid.length;
        int ans[]=new int[2];
        int freq[]=new int[n*n+1];
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
        {
            freq[grid[i][j]]++;
            sum=sum+grid[i][j];
            if(freq[grid[i][j]]==2) ans[0]=grid[i][j];
        }
        sum-=ans[0];
        ans[1]=((n*n)*(n*n+1))/2-sum;
        return ans;

    }
}