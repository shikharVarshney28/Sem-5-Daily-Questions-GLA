// Last updated: 8/7/2025, 2:46:19 PM
class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        Queue<Integer> qu=new LinkedList<>();
        for(int i:nums) qu.add(i);
        List<List<Integer>> ans=new ArrayList<>();
        while(qu.size()!=0)
        {
            int n=qu.size();
            ArrayList<Integer> a=new ArrayList<>();

            for(int i=1;i<=n;i++){
                if(!a.contains(qu.peek())) a.add(qu.remove());
                else qu.add(qu.remove());
            }
            ans.add(a);
        }
        return ans;
    }
}