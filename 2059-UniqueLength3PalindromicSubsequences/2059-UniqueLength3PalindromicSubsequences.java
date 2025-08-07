// Last updated: 8/7/2025, 2:48:51 PM
class Solution {
    public int countPalindromicSubsequence(String s) {
        HashMap<Character, Integer> firstOccurance = new HashMap<>();
        HashMap<Character, Integer> lastOccurance = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!firstOccurance.containsKey(ch)) {
                firstOccurance.put(ch, i);
                lastOccurance.put(ch, i);
            } else {
                lastOccurance.put(ch, i);
            }
        }
        int ans = 0;
        for (char ch : firstOccurance.keySet()) {
            if (firstOccurance.get(ch) != lastOccurance.get((ch))) {
                int st = firstOccurance.get(ch) + 1, end = lastOccurance.get(ch);
                HashSet<Character> hSet = new HashSet<>();
                for (int i = st; i < end; i++) {
                    hSet.add(s.charAt(i));
                }
                ans += hSet.size();
            }
        }
        return ans;
    }
}