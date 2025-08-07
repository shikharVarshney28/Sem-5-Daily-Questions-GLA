// Last updated: 8/7/2025, 2:53:34 PM
class Solution {
    HashSet<String> ans;

    void find(String s, int idx) {
        if (idx >= s.length()) {
            ans.add(s);
            return;
        }
        if (s.charAt(idx) >= 'a' && s.charAt(idx) <= 'z') {
            //this is a charcater change to upperCase

            find(s.substring(0, idx) + (char) (s.charAt(idx) - 'a' + 'A') + s.substring(idx + 1), idx + 1);
        } else if (s.charAt(idx) >= 'A' && s.charAt(idx) <= 'Z') {
            //this is a charcater change to lowerCase

            find(s.substring(0, idx) + (char) (s.charAt(idx) - 'A' + 'a') + s.substring(idx + 1), idx + 1);
        }
        //or leave it asit as
        find(s, idx + 1);
    }

    public List<String> letterCasePermutation(String s) {
        ans = new HashSet<>();
        find(s, 0);
        return new ArrayList<>(ans);
    }
}