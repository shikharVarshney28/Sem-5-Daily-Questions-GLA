// Last updated: 8/7/2025, 2:52:49 PM
class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int ans[]=new int[nums.length];
        int i=0,j=1,k=0;
        while(k<nums.length)
        {
            if(nums[k]%2==0)
            {
                ans[i]=nums[k];
                i+=2;
            }
            else{
                ans[j]=nums[k];
                j+=2;
            }
            k++;
        }
        return ans;
    }
}