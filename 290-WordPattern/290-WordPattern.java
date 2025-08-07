// Last updated: 8/7/2025, 2:56:38 PM
class Solution {
    boolean find(String pattern, String[] arr) {
        HashMap<Character, String> hmap = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            String s = arr[i];
            if (!hmap.containsKey(ch)) {
                if (hmap.containsValue(s))
                    return false;
                hmap.put(ch, s);
            } else {
                if (!hmap.get(ch).equals(s))
                    return false;
            }
        }
        return true;
    }

    public boolean wordPattern(String pattern, String s) {
        String[] arr = s.split(" ");
        if (pattern.length() != arr.length)
            return false;
        return find(pattern, arr);
    }
}