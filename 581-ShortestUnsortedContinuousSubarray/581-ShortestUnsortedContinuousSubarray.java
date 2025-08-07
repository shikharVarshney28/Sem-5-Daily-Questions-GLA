// Last updated: 8/7/2025, 2:54:32 PM
class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int n = nums.length;
        int[] sorted = nums.clone(); // make a copy
        Arrays.sort(sorted); // sort the copy

        int start = 0, end = n - 1;

        // Find first mismatch from the start
        while (start < n && nums[start] == sorted[start]) {
            start++;
        }

        // Find first mismatch from the end
        while (end > start && nums[end] == sorted[end]) {
            end--;
        }

        return end - start + 1;
    }
}