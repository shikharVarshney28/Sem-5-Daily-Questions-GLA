// Last updated: 8/7/2025, 2:58:57 PM
class Solution {
    public int maxProfit(int[] prices) {
        int ans = 0,max = prices[prices.length-1];
        for (int i = prices.length-2; i >=0 ; i--) {
            ans = Math.max(ans, max - prices[i]);
            max = Math.max (max,prices [i]);
        }
        return ans;
    }
}