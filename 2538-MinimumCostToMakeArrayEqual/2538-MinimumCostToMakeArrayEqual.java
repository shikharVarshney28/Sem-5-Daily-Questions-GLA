// Last updated: 10/16/2025, 10:45:30 AM
class Solution {
    public long minCost(int[] nums, int[] costs) {
        int left = Arrays.stream(nums).min().getAsInt();
        int right = Arrays.stream(nums).max().getAsInt();

        while (right - left > 2) {
            int mid1 = left + (right - left) / 3;
            int mid2 = right - (right - left) / 3;

            long cost1 = computeCost(nums, costs, mid1);
            long cost2 = computeCost(nums, costs, mid2);

            if (cost1 < cost2) {
                right = mid2;
            } else {
                left = mid1;
            }
        }

        long minCost = Long.MAX_VALUE;
        for (int i = left; i <= right; i++) {
            minCost = Math.min(minCost, computeCost(nums, costs, i));
        }

        return minCost;
    }

    private long computeCost(int[] nums, int[] costs, int target) {
        long total = 0;
        for (int i = 0; i < nums.length; i++) {
            total += (long) Math.abs(nums[i] - target) * costs[i];
        }
        return total;
    }
}
