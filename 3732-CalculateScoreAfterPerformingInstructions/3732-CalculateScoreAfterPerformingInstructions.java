// Last updated: 8/7/2025, 2:43:48 PM
class Solution {
    public long calculateScore(String[] instructions, int[] values) {
        int i=0;
        boolean used[]=new boolean[values.length];
        long ans=0;
        while(i<values.length && i>=0){
            if(used[i]) break;
            used[i]=true;
            if(instructions[i].equals("add")){
                ans+=values[i];
                i++;
            }else{
                i+=values[i];
            }
        }
        return ans;
    }
}