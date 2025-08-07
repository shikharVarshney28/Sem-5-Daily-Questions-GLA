// Last updated: 8/7/2025, 2:46:24 PM
class Solution {
    public long findTheArrayConcVal(int[] nums) {
        int st=0,end=nums.length-1;long sum=0;
        while(st<end)
        {
            String s=""+nums[st]+nums[end];
           // System.out.println(s);
            sum=sum+Integer.parseInt(s);
            st++;end--;
        }
        if(st==end) sum+=nums[st];
        return sum;
    }
}