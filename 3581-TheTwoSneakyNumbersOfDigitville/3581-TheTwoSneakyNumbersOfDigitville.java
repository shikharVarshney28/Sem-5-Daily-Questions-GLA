// Last updated: 8/7/2025, 2:44:14 PM
class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashMap<Integer,Integer> h=new HashMap<>();
        int ans[]=new int[2];
        int idx=0;
        for(int i:nums){
            if(!h.containsKey(i)) h.put(i,1);
            else ans[idx++]=i;
        }
        return ans;
    }
}