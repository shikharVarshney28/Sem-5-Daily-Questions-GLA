// Last updated: 8/7/2025, 2:54:17 PM
class Solution {
    int find(int arr[][],int curr[],int prev[],int count[],int ind){
        if(prev[1] >= curr[0]) return 0;
        if(count[ind] != -1001) return count[ind];
        int ans =0;
        for(int i=0;i<arr.length;i++){
            ans= Math.max (ans,find(arr,arr[i],curr,count,i));
        }
        return count[ind] = ans+1;
    }
    public int findLongestChain(int[][] pairs) {
        int ans=0,n=pairs.length;
        int count[]=new int[n];
        Arrays.fill (count,-1001);
        for(int i=0;i<n;i++){
            ans = Math.max (ans,find(pairs,pairs[i],new int[]{-1001,-1001},count,i));
        }
        //for(int i:count) System.out.println (i);
        return ans;
    }
}