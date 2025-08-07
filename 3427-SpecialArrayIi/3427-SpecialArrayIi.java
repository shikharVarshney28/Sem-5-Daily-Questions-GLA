// Last updated: 8/7/2025, 2:44:56 PM
class Solution {
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
        int count[]=new int[nums.length];
        boolean res[]=new boolean[queries.length];
        int c=0;
        count[0]=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]%2 == nums[i]%2){
                c++;
            }
            count[i]=c;
        }
        int idx=0;
        for(int [] query: queries){
            res[idx++]= count[query[1]] - count[query[0]]==0;
        }
        return res;
    }
}