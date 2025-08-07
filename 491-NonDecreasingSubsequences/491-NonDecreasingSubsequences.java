// Last updated: 8/7/2025, 2:55:13 PM
class Solution {
    Set<List<Integer>> ans;
    void find(int []nums,int idx,List<Integer>ds){
        if( ds.size()>1){
            ans.add(new ArrayList<>(ds));
        }
        for(int i=idx;i<nums.length;i++){
            if((ds.size()==0 || ds.get(ds.size()-1)<=nums[i])){
                ds.add(nums[i]);
                find(nums,i+1,ds);
                ds.remove(ds.size()-1);
            }
        }
    }
    public List<List<Integer>> findSubsequences(int[] nums) {
        ans=new HashSet<>();
        find(nums,0,new ArrayList<>());
        return new ArrayList<>(ans);
    }
}