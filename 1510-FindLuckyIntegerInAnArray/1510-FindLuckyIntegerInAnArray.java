// Last updated: 8/7/2025, 2:50:50 PM
class Solution {
    public int findLucky(int[] arr) {
        int freq[] = new int[501];
        for (int i : arr)
            freq[i]++;
        int ans = -1;
        for (int i = 1; i < 501; i++) {
            if (freq[i] == i)
                ans = i;
        }
        return ans;
    }
}