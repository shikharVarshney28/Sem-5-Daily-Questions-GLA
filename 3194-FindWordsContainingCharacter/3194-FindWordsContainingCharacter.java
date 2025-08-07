// Last updated: 8/7/2025, 2:45:44 PM
class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            boolean flag = false;
            String s = words[i];
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == x) {
                    flag = true;
                    break;
                }
            }
            if (flag)
                ans.add(i);
        }
        return ans;
    }
}