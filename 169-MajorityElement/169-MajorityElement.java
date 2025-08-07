// Last updated: 8/7/2025, 2:57:57 PM
class Solution {
    public int majorityElement(int[] nums) {
        int vote=1,candidate=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            // so new candidate must be added if candidate is not same and thus its vote becames 1 else we keep on adding the votes;
            if(nums[i]==candidate){
                vote++;
            }else{
                vote--;
                if(vote==0){
                    candidate=nums[i];
                    vote=1;
                }
            }
        }
        return candidate;
    }
}