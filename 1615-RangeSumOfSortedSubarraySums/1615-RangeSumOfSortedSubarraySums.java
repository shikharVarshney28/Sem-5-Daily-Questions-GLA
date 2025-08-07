// Last updated: 8/7/2025, 2:50:26 PM
class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        List<Integer> ans=new ArrayList<>();
       for(int i=0;i<nums.length;i++)
       {
            int sum=0;
            for(int j=i;j<nums.length;j++)
            {
                sum+=nums[j];
                ans.add(sum);
            }
       }
       Collections.sort(ans);
       System.out.println(ans);
       int sum=0;
       int mod=(int) 1e9+7;
       for(int i=left-1;i<right;i++)
       {
        sum=(sum+ans.get(i))%mod;
       }
       return sum;
    }
}