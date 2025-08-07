// Last updated: 8/7/2025, 2:44:38 PM
class Solution {
    public double minimumAverage(int[] nums) {
        int n=nums.length;
        double[] avg=new double[n/2];
        Arrays.sort(nums);
        int i=0,j=n-1,k=0;
        while(i<j)
        {
            avg[k++]=(nums[i]+nums[j])/2.0;
            i++;j--;
        }
        Arrays.sort(avg);
        return avg[0];
    }
}