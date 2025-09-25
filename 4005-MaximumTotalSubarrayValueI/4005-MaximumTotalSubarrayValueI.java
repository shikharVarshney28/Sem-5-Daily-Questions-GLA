// Last updated: 9/25/2025, 4:50:39 PM
class Solution {
    public long maxTotalValue(int[] nums, int k) {
        int max = Arrays.stream(nums).max().getAsInt();
        int min = Arrays.stream(nums).min().getAsInt();
        return (long)(max - min) * k;
    }
}