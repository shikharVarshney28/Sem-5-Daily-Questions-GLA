// Last updated: 8/7/2025, 2:57:28 PM
class Solution {
    void findSum (int target,int size,int idx,ArrayList ds,List<List<Integer>> ans){
        if(target==0 && ds.size()==size){
            ans.add (new ArrayList<>(ds));
            return;
        }
        if(ds.size ()>size || target<idx) return;
        for(int i=idx;i<10;i++){
            if(ds.contains(idx)) return;
            if(target>=i ){
                ds.add(i);
                findSum(target-i,size,i+1,ds,ans);
                ds.remove(ds.size()-1);
            }
        }
    }

    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans=new ArrayList<>();
        findSum(n,k,1,new ArrayList<>(),ans);
        return ans;
    }
}