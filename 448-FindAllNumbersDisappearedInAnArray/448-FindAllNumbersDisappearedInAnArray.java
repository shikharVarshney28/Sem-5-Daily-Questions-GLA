// Last updated: 8/7/2025, 2:55:28 PM
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> a=new ArrayList<>();
        int n=nums.length;
        int[] f=new int[n+1];
        for(int i=0;i<n;i++) f[nums[i]]++;
        for(int i=1;i<n+1;i++)
        {
            if(f[i]==0) a.add(i);
        }
        return a;
    }
}