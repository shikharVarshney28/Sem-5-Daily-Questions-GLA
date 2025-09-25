// Last updated: 9/25/2025, 4:50:58 PM
class Solution {
    public int maxFreqSum(String s) {
        int arr[] = new int[26];
        for (char ch : s.toCharArray())
            arr[ch - 'a']++;
        int maxC = -1, maxV = -1;
        for (int i = 0; i < 26; i++) {
            char ch = (char) (i + 'a');
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                maxV = Math.max(maxV, arr[i]);
            } else
                maxC = Math.max(maxC, arr[i]);
        }
        return maxC + maxV;
    }
}