// Last updated: 8/7/2025, 3:01:03 PM
class Solution {
    void find(String digits, int idx, String[] keypad, StringBuilder s, List<String> res) {
        if (idx >= digits.length()) {
            res.add(s.toString());
            return;
        }
        String word = keypad[digits.charAt(idx) - '0'];
        for (int i = 0; i < word.length(); i++) {
            find(digits, idx + 1, keypad, s.append(word.charAt(i)), res);
            s.deleteCharAt(s.length() - 1);
        }
    }

    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0)
            return new ArrayList<>();
        String[] keypad = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
        List<String> res = new ArrayList<>();
        find(digits, 0, keypad, new StringBuilder(), res);
        return res;
    }
}