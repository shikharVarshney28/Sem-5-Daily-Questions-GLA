// Last updated: 8/7/2025, 2:50:20 PM
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        return numBottles+(numBottles-1)/(numExchange-1);
    }
}