// Last updated: 8/7/2025, 2:48:34 PM
class Solution {
    public int[] missingRolls(int[] arr, int mean, int n) {
        int sum=0,count=0;
        for(int i:arr)
        {
            sum+=i;
            count++;
        }
        int totalObs=mean*(n+count);
        int reqSum=totalObs-sum;
        if(reqSum<n || reqSum>6*n) return new int[0];
        int ans=reqSum/n,rem=reqSum%n,idx=0;
        int res[]=new int[n];
        for(int i=0;i<n;i++){
            res[i]=ans;
            if(rem>0){
                res[i]++;
                rem--;
            }
        }
        return res;
    }  
}