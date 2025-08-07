// Last updated: 8/7/2025, 2:53:37 PM
class Solution {
    public int search(int[] nums, int target) {
        int st=0,end=nums.length-1;
        while(st<=end)
        {
            int mid=st+(end-st)/2;
            if(nums[mid]==target) return mid;
            else if(nums[mid]<target) st=mid+1;
            else end=mid-1;
        }
        return -1;
    }
}