// Last updated: 8/7/2025, 2:49:23 PM
class Solution {
    public int minimumSize(int[] nums, int maxOperations) {
        int max=0;
        for(int i:nums) max= Math.max(max,i);
        int st=1,end = max,ans =0;
        while(st<=end){
            int mid = st +(end - st)/2;
            if(isPossible(nums,maxOperations,mid)){
                ans=mid;
                //now minimize the panalty
                end = mid -1;
            }else st = mid+1;
        }
        return ans;
    }
    boolean isPossible(int arr[],int k,int mid){
        //lets see whether we can create max penalty of mid within k..?
        int countOpr=0;
        for(int i:arr){
            if(i%mid==0){
                countOpr+=(i/mid)-1; // to convet 8 penalty into 4 we need 1 move but i/mid gives 2 so need to sub 1...
            }else countOpr+=(i/mid);
            if(countOpr>k) return false;
        }
        return true;
    }
}





