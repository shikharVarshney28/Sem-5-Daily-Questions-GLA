// Last updated: 8/7/2025, 2:50:24 PM
class Solution {
    public int numOfSubarrays(int[] arr) {
        int prefixSum =0 ,oddCnt =0 ,evenCnt =1,ans=0,mod = (int)(Math.pow(10,9)+7);
        for(int i:arr){
            prefixSum += i;
            if(prefixSum % 2 == 0){
                evenCnt ++;
                ans+=oddCnt;
            }else{
                oddCnt++;
                ans+=evenCnt;
            }
            ans %= mod;
        }
        return ans;
    }
}