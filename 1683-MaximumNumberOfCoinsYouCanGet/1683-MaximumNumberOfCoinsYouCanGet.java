// Last updated: 8/7/2025, 2:50:08 PM
class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int n=piles.length/3;
        int ans=0,idx=piles.length-1;
        while(n-->0){
            ans+=piles[--idx];
            idx--;
        }
        return ans;
    }
}