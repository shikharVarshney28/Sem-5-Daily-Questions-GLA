// Last updated: 8/7/2025, 2:44:09 PM
class Solution {
    public int minElement(int[] nums) {
        int min= Integer.MAX_VALUE;
        for(int n:nums){
            int sum=0 , i=n;
            while(i>0){
                sum+=i% 10;
                i/= 10;
            }
            min=Math.min(min,sum);
        }
        return min;
    }
}