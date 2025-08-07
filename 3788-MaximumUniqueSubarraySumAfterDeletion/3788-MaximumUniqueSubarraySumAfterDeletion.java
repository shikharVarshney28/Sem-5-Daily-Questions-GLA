// Last updated: 8/7/2025, 2:43:40 PM
class Solution {
    public int maxSum(int[] nums) {
        List<Integer>unique=new ArrayList<>();
        int ans=0,sum=0;
        for(int i=0;i<nums.length;i++){
              if(nums[i]<0 || unique.contains(nums[i])){
                continue;
            }
            else{
                sum+=nums[i];
                unique.add(nums[i]);
            }
        }
        ans= Math.max(ans,sum);
        if(ans==0){
            Arrays.sort (nums);
            return nums[nums.length-1];
        }
        return ans;
    }
}