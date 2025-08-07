// Last updated: 8/7/2025, 2:59:31 PM
class Solution {
    void subset(int idx,int[] arr,ArrayList ds,List<List<Integer>> ans)
    {
        
        ans.add(new ArrayList<>(ds));
        for(int i=idx;i<arr.length;i++)
        {
            if(i!=idx && arr[i-1]==arr[i]) continue;

            ds.add(arr[i]);
            subset(i+1,arr,ds,ans);
            ds.remove(ds.size()-1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
       List<List<Integer>> ans=new ArrayList<>();
       Arrays.sort(nums);
       subset(0,nums,new ArrayList<>(),ans);
       return ans; 
    }
}