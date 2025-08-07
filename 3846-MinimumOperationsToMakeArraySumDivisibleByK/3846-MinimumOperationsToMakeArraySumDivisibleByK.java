// Last updated: 8/7/2025, 2:43:17 PM
class Solution {
    public int minOperations(int[] nums, int k) {
        int sum = Arrays.stream(nums).sum();
        return sum  - sum / k * k;
    }
}