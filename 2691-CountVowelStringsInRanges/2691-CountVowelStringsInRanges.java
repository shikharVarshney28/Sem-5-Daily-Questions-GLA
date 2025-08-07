// Last updated: 8/7/2025, 2:46:28 PM
class Solution {
    public boolean vowel(String s) {
        char st = s.charAt(0), end = s.charAt(s.length() - 1);
        if ((st == 'a' || st == 'e' || st == 'i' || st == 'o' || st == 'u')
                && (end == 'a' || end == 'e' || end == 'o' || end == 'i' || end == 'u'))
            return true;
        return false;
    }

    public int[] vowelStrings(String[] words, int[][] queries) {
        int count[] = new int[words.length];
        count[0] = vowel(words[0]) ? 1 : 0;
        for (int i = 1; i < words.length; i++) {
            count[i] = vowel(words[i]) ? count[i - 1] + 1 : count[i - 1];
        }
        int res[] = new int[queries.length];
        int idx = 0;
        for (int query[] : queries) {
            int st = query[0], end = query[1];
            if (st != end && st != 0) {
                res[idx++] = count[end] - count[st -1];
            } else if (st == end && st != 0)
                res[idx++] = count[end] - count[end - 1];
            else
                res[idx++] = count[end];

        }
        return res;
    }
}