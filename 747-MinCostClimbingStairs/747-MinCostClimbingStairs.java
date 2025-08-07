// Last updated: 8/7/2025, 2:53:52 PM
class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int arr[]=new int[n+1];
        int c=0;
        arr[0]=cost[0];arr[1]=cost[1];
        for(int i=2;i<=n;i++){
            arr[i]=Math.min (arr[i -1],arr[i-2]);
            if(i!=n) arr[i]+=cost[i];
        }
        return arr[n];
    }
}