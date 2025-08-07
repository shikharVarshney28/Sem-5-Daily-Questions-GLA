// Last updated: 8/7/2025, 3:00:28 PM
class Solution {
    void perm(int [] nums,int idx,List<List<Integer>> ans,List <Integer> ds,boolean vis[]){
        if(ds.size ()==nums.length){
            if(!ans.contains(ds))
            ans.add (new ArrayList <>(ds));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!vis[i]){
                vis[i]=true;
                ds.add (nums[i]);
                perm(nums,i+1,ans,ds,vis);
                ds.remove (ds.size ()-1);
                vis[i]=false;
            }
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        boolean vis[]=new boolean [nums.length];
        perm(nums,0,ans,new ArrayList<>(),vis);
        return ans;
    }
}