// Last updated: 8/7/2025, 2:49:52 PM
class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String a = "";
        String b = "";
        for (String s : word1)
            a += s;
        for (String s : word2)
            b += s;
        return a.equals(b);
    }
}