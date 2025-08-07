// Last updated: 8/7/2025, 2:58:48 PM
class Solution {
    boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i++) != s.charAt(j--))
                return false;
        }
        return true;
    }

    void form(String s, List<String> ds, List<List<String>> ans) {
        if (s.length() == 0) {
            ans.add(new ArrayList<>(ds));
            return;
        }
        for (int i = 1; i <= s.length(); i++) {
            if (!isPalindrome(s.substring(0, i))) continue;
                ds.add(s.substring(0, i));
                form(s.substring(i), ds, ans);
                ds.remove(ds.size() - 1);
            
        }
    }

    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        form(s, new ArrayList<>(), ans);
        return ans;
    }
}