// Last updated: 8/7/2025, 2:59:00 PM
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans=new ArrayList<>();
        for(int row=0;row<numRows;row++){
            List<Integer> subAns=new ArrayList<>();
            int ncr=1;
            for(int col=0;col<=row;col++){
                subAns.add(ncr);
                ncr=(row-col)*ncr/(col+1);
            }
            ans.add(subAns);
        }
        return ans;
    }
}