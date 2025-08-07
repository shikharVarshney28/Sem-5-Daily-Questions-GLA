// Last updated: 8/7/2025, 3:00:16 PM
class Solution {
    public int maxSubArray(int[] arr) {
        int ans=Integer.MIN_VALUE,sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            ans=Math.max(ans, sum);
            if(sum<0) sum=0;
        }
        return ans;
    }
}