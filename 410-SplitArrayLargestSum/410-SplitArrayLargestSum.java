// Last updated: 8/7/2025, 2:55:46 PM
class Solution {
    public int splitArray(int[] nums, int k) {
        int sum=0;
        for(int i : nums) sum+=i;
        int start=0,end=sum,ans=0;
        while(start<=end){
            int mid= end - (end - start)/2;
            if(itsPossible (nums,k,mid)){
                ans=mid;
                end=mid-1;
            }else start= mid+1;

        }
        return ans;
    }
    boolean itsPossible(int [] arr,int k,int mid){
        int sum=0,idx=0,n=1;
        while(idx<arr.length){
            if(sum+arr[idx]<=mid){
                sum += arr[idx++];
            }else{
                n++;
                if(n>k) return false;
                sum=0;
            }
        }
        return true;
    }
}