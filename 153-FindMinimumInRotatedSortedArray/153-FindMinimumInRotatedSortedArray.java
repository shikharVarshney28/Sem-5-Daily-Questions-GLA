// Last updated: 8/7/2025, 2:58:21 PM
class Solution {
    public int findMin(int[] nums) {
        int st=0,end=nums.length-1,mini=50001;
        while(st<=end)
        {
            int mid=st+(end-st)/2;
            // Soreted Array is in left
            if(nums[st]<=nums[mid]){
                mini=Math.min(mini,nums[st]);
                // NOw move to rigth array
                st=mid+1;
            }
            else{ // Right is sorted
            mini=Math.min(mini,nums[mid]);
            end=mid-1;
            }
        }
        return mini;
    }
}