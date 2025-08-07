// Last updated: 8/7/2025, 2:50:35 PM
class Solution {
    public int[] finalPrices(int[] prices) {
        for(int i=0;i<prices.length;i++){
            int element=prices[i];
            for(int j=i+1;j<prices.length;j++){
                if(prices[i]>=prices[j]){
                    element-=prices[j];
                    break;
                }
            }
            prices[i]=element;
        }
        return prices;
    }
}