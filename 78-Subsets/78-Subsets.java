// Last updated: 8/7/2025, 2:59:44 PM
class Solution {
    void find(int []nums,int idx,List<List<Integer>> ans,List<Integer> ds){
        ans.add (new ArrayList <>(ds));
        for(int i=idx;i<nums.length;i++){
            ds.add (nums[i]);
            find(nums,i+1,ans,ds);
            ds.remove (ds.size ()-1);
        }
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList <>();
        find(nums,0,ans,new ArrayList<>());
        return ans;
    }
}