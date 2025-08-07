// Last updated: 8/7/2025, 2:53:43 PM
class Solution {
    public int maxChunksToSorted(int[] arr) {
        int max=Integer.MIN_VALUE;
        int noOfChunks=0;
        for(int i=0;i<arr.length;i++){
            max=Math.max (max,arr[i]);
            if(i+1>max) noOfChunks++;
        }
        return noOfChunks;
    }
}