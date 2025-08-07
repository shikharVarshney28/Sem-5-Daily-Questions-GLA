// Last updated: 8/7/2025, 2:44:26 PM
class Solution {
    public int[] resultsArray(int[] nums, int k) {
        int n=nums.length;
        int ans[]=new int[n-k+1];
        int end=k-1,start=0,idx=0;
        while(end<n)
        {
            int max=nums[start],count=nums[start];boolean flag=false;
            for(int j=start;j<=end-1;j++){
                if(nums[j]<nums[j+1] && nums[j+1]==++count){
                    max=nums[j+1];
                }else{
                    flag=true;
                    break;
                }
            }
            ans[idx++] = flag ? -1 : max;
            end++;start++;
        }
        return ans;
    }
}