// Last updated: 8/7/2025, 2:52:52 PM
class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        int[] freq = new int[26];

        for (String s : words2) {
            int[] count = new int[26];
            for (int i = 0; i < s.length(); i++) {
                count[s.charAt(i) - 'a']++;
            }
            for (int i = 0; i < 26; i++) {
                freq[i] = Math.max(freq[i], count[i]);
            }
        }
        List<String> ans = new ArrayList<>();
        for (String s : words1) {
            int[] freq2 = new int[26];
            for (int i = 0; i < s.length(); i++) {
                freq2[s.charAt(i) - 'a']++;
            }
            boolean flag = true;
            for (int i = 0; i < 26; i++) {
                if (freq2[i] < freq[i]) {
                    flag = false;
                    break;
                }
            }
            if (flag)
                ans.add(s);
        }
        return ans;
    }
}