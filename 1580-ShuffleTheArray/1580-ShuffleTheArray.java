// Last updated: 8/7/2025, 2:50:31 PM
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int [] ans=new int[2*n];
        int idx=0,st=0,end=n;
        while(end!=nums.length)
        {
            ans[idx++]=nums[st++];
            ans[idx++]=nums[end++];
        }
        return ans;
    }
}