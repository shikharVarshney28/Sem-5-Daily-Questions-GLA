// Last updated: 8/7/2025, 2:48:04 PM
class Solution {
    public int prefixCount(String[] words, String pref) {
        int ans = 0;
        for (String s : words) {
            if (s.length()>=pref.length() && s.substring(0,pref.length()).equals(pref))
                ans++;
        }
        return ans;
    }
}