// Last updated: 8/7/2025, 2:50:07 PM
class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int prefixSum[] = new int[arr.length];
        prefixSum[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j += 2) {
                sum = sum + prefixSum[j] - (i == 0 ? 0 : prefixSum[i - 1]);
            }
        }
        return sum;
    }
}