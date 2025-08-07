// Last updated: 8/7/2025, 2:56:28 PM
class Solution {
    int sum(int []coins,int idx,int target,int [][]arr){
        if(target<0) return Integer.MAX_VALUE;
        if(target==0) return 1;
        if(arr[idx][target]!=0) return arr[idx][target];
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(target>=coins[i]){
                min=Math.min(sum(coins,i,target - coins[i],arr),min);
            }

        }
        if(min == Integer.MAX_VALUE) return arr[idx][target]=Integer.MAX_VALUE;
        return arr[idx][target]=min +1;
    }
    public int coinChange(int[] coins, int amount) {
        if(amount ==0) return 0;
        int [][] arr=new int[coins.length][amount+1];
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<coins.length;i++){
            ans=Math.min (ans,sum(coins,i,amount - coins[i],arr));
        }
        if(ans==Integer.MAX_VALUE) ans=-1;
        return ans;
    }
}