// Last updated: 8/7/2025, 2:46:03 PM
class Solution {
    public int countCompleteSubarrays(int[] nums) {
        HashSet<Integer> hSet = new HashSet<>();
        for(int i:nums){
            hSet.add(i);
        }
        int n = nums.length;
        int k = hSet.size(),ans=0;
        if(k==1){
            return (n*(n + 1))/2;
        }
        hSet = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            hSet.add (nums[i]);
            for(int j=i+1;j<nums.length;j++){
                hSet.add(nums[j]);
                if(hSet.size()==k) ans++;
            }
            hSet=new HashSet<>();
        }
        return ans;
    }
}