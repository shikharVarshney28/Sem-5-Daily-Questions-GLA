// Last updated: 8/7/2025, 2:43:23 PM
class Solution {
    public int[] minCosts(int[] cost) {
        int ans[]=new int[cost.length];
        ans[0]=cost[0];
        for(int i=1;i<cost.length;i++){
            ans[i]=Math.min (cost[i],ans[i-1]);
        }
        return ans;
    }
}