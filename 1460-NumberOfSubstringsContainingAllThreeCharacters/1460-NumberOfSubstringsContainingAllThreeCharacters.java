// Last updated: 8/7/2025, 2:51:14 PM
class Solution {
    public int numberOfSubstrings(String s) {
        int freq[] = new int[3];
        int n = s.length();
        int left = 0, ans = 0;
        for (int right = 0; right < n; right++) {
            freq[s.charAt(right) - 'a']++;
            while (freq[0] > 0 && freq[1] > 0 && freq[2] > 0) {
                // we have found ans answer...
                ans += (n - right);
                // now shrink
                freq[s.charAt(left) - 'a']--;
                left++;
            }
        }
        return ans;
    }
}