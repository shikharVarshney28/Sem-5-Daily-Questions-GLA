// Last updated: 8/7/2025, 2:45:12 PM
class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        int i = happiness.length - 1, count = 0;
        long sum = 0;
        while (i >= 0 && (happiness[i] - count) > 0 && count < k) {
            sum += (happiness[i--] - count);
            count++;
        }
        return sum;
    }

}