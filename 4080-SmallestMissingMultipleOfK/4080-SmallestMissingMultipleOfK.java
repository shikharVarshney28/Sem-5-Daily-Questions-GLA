// Last updated: 11/19/2025, 12:33:15 PM
class Solution {
    public int missingMultiple(int[] nums, int k) {
        int n = 10001;
        int freq[] = new int[n + 1];
        for (int i : nums)
            if (i % k == 0)
                freq[i / k]++;
        for (int i = 1; i < n; i++)
            if (freq[i] == 0)
                return i * k;
        return k * (n + 1);
    }
}