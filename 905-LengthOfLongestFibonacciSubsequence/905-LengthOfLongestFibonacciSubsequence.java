// Last updated: 8/7/2025, 2:53:08 PM
class Solution {
    public int lenLongestFibSubseq(int[] arr) {
        HashSet<Integer> hSet= new HashSet <>();
        int ans=0;
        for(int i:arr) hSet.add (i);
        for(int i=0;i<arr.length;i++){
            for(int j= i+1;j<arr.length;j++){
                // we chose 2. numbs arr[i] && arr[j];
                int len =2,prev = arr[j];
                int curr = arr[i] + arr[j];
                while(hSet.contains (curr)){
                    int temp = curr;
                    curr+=prev;
                    prev = temp;
                    len++;
                    ans = Math.max (len , ans);
                }
            }
        }
        return ans;
    }
}