// Last updated: 8/7/2025, 2:56:02 PM
class Solution {
    public int kthSmallest(int[][] nums, int k) {
        TreeMap<Integer,Integer> h=new TreeMap<>();
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums.length;j++)
            {
                if(!h.containsKey(nums[i][j])) h.put(nums[i][j],1);
                else h.put(nums[i][j],h.get(nums[i][j])+1);
            }
        }
        System.out.print(h);
        int z=0;
        for(int i:h.keySet())
        {
            z+=h.get(i);
            if(z>=k) return i;
        }
        return 13;
    }
}