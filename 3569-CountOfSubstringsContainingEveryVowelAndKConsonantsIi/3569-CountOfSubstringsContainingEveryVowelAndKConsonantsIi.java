// Last updated: 8/7/2025, 2:44:16 PM
class Solution {
    public long countOfSubstrings(String word, int k) {
        return atLeast(word, k) - atLeast(word, k + 1); // exactly k ---> atLeast(k) - atLeast(k+1);
    }

    public long atLeast(String word, int k) {
        int consonents = 0, left = 0, n = word.length();
        HashMap<Character, Integer> vowels = new HashMap<>();
        long ans = 0;
        for (int right = 0; right < n; right++) {
            char ch = word.charAt(right);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels.put(ch, vowels.getOrDefault(ch, 0) + 1);
            } else
                consonents++;
            while (vowels.size() == 5 && consonents >= k) {
                // now all the substring will have alteast 5vowels and k consonents
                ans += (n - right);
                // now shrink the window
                ch = word.charAt(left);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels.put(ch, vowels.get(ch) - 1);
                    if (vowels.get(ch) == 0)
                        vowels.remove(ch);
                } else
                    consonents--;
                left++;
            }
        }
        return ans;
    }
}