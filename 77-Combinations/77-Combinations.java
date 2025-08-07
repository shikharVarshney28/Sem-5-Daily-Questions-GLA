// Last updated: 8/7/2025, 2:59:45 PM
class Solution {
    void find(int n,int k,List<List<Integer>> ans,List<Integer> ds,int idx){
        if(ds.size()==k){
            ans.add (new ArrayList <>(ds));
            return;
        }
        for(int i=idx;i<=n;i++){
            ds.add (i);
            find(n,k,ans,ds,i+1);
            ds.remove (ds.size ()-1);
        }
    }
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans=new ArrayList <>();
        find(n,k,ans,new ArrayList<>(),1);
        return ans;
    }
}