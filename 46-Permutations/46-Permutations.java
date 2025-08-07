// Last updated: 8/7/2025, 3:00:29 PM
class Solution {
    void perm(int[] arr,boolean [] check,ArrayList ds,List<List<Integer>> ans)
    {
        if(ds.size()==arr.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=0;i<arr.length;i++)
        {
            if(!check[i])
            {
                check[i]=true;
                ds.add(arr[i]);
                perm(arr,check,ds,ans);
                ds.remove(ds.size()-1);
                check[i]=false;
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        boolean [] check=new boolean[nums.length];
        List<List<Integer>> ans=new ArrayList<>();
        perm(nums,check,new ArrayList<>(),ans);
        return ans;
    }
}