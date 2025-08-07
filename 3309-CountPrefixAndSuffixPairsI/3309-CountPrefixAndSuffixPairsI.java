// Last updated: 8/7/2025, 2:45:24 PM
class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int ans = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].length() > words[j].length())
                    continue;
                // finding prefix && sufix;
                if (words[j].startsWith(words[i]) && words[j].endsWith(words[i]))
                    ans++;

            }
        }
        return ans;
    }
}