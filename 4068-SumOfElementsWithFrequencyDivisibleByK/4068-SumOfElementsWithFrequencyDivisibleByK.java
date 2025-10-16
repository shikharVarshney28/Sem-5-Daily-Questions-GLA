// Last updated: 10/16/2025, 10:42:17 AM
class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        int freq[] = new int[Arrays.stream(nums).max().getAsInt() + 1];
        int sum = 0;
        for (int i : nums)
            freq[i]++;
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] % k == 0) {
                sum += (freq[i] * i);
            }
        }
        return sum;
    }
}