// Last updated: 8/7/2025, 3:00:38 PM
class Solution {
    void sum(int []nums,int idx,int target,List<List<Integer>> ans,List<Integer>ds){
            if(target==0) {
                ans.add (new ArrayList<>(ds));
                return;
        }
        for(int i=idx;i<nums.length;i++){
            if(target>=nums[i]){
                //System.out.println (ds);
                ds.add (nums[i]);
                sum(nums,i,target-nums[i],ans,ds);
                ds.remove(ds.size()-1);
            }
        }
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        sum(candidates , 0,target,ans,new ArrayList <>());
        return ans;
    }
}