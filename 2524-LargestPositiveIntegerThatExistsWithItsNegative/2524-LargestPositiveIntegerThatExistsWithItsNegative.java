// Last updated: 8/7/2025, 2:47:05 PM
class Solution {
    public int findMaxK(int[] nums) {
        int i=0,j=nums.length-1,mac=-1;
        Arrays.sort(nums);
        //for(int f=0;f<nums.length;f++) System.out.print(nums[f]+"\t");
        //System.out.println();
        while(i<j)
        {
            int x=(int)Math.abs(nums[i]),y=(int)Math.abs(nums[j]);
            if(x==y && nums[i]!=nums[j]) mac=(int)Math.max(mac,y);
            //System.out.println(mac);
            if(x>y) i++;
            else j--;
        }
        return mac;
    }
}