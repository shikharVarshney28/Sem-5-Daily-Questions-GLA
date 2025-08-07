// Last updated: 8/7/2025, 2:58:46 PM
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int gasSum=0,costSum=0;
        for(int i: gas) gasSum+=i;
        for(int i: cost) costSum+=i;
        if(gasSum-costSum<0) return -1;
        int idx=0,currGas=0;
        for(int i=0;i<gas.length;i++){
            currGas+=gas[i] - cost[i];
            if(currGas<0){
                idx=i+1;
                currGas=0;
            }
            
        }
        return idx;
    }
}