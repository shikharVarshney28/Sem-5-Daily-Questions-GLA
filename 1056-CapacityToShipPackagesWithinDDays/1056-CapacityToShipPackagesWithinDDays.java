// Last updated: 8/7/2025, 2:52:27 PM
class Solution {
    boolean itsPossible (int [] arr,int days,int mid){
        int idx=0,sum=0,n=1;
        while(idx<arr.length){
            if(sum+arr[idx]<=mid){
                sum+=arr[idx++];
            }else{
                n++;
                sum=0;
                if(n>days) return false;
            }
        }
        return true;
    }
    public int shipWithinDays(int[] weights, int days) {
        int sum=0;
        for(int i:weights) sum+=i;
        int n=weights.length;
        int start=0,end=sum;
        int ans=0;
        while(start<=end){
            int mid=end-(end-start)/2;
            if(itsPossible(weights,days,mid)){
                ans=mid;
                end=mid-1;
            }else start=mid+1;
        }
        return ans;
    }
}