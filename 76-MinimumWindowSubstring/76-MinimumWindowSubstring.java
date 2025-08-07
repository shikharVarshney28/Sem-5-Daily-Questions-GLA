// Last updated: 8/7/2025, 2:59:47 PM
class Solution {
    class Pair {
        boolean possible;
        String s;

        Pair(boolean possible, String s) {
            this.possible = possible;
            this.s = s;
        }
    }

    public String minWindow(String s, String t) {
        if (t.length() > s.length())
            return "";
        int st = t.length(), end = s.length();
        String ans = "";
        while (st <= end) {
            int mid = (st + end) / 2;
            Pair pair = itsPossible(s, t, mid);
            if (pair.possible) {
                ans = pair.s;
                end = mid - 1;
            } else
                st = mid + 1;
        }
        return ans;
    }

    Pair itsPossible(String s, String t, int mid) {
        HashMap<Character, Integer> hmap = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            hmap.put(t.charAt(i), hmap.getOrDefault(t.charAt(i), 0) + 1);
        }
        String temp = s.substring(0, mid);
        for (int i = 0; i < mid; i++) {
            if (hmap.containsKey(temp.charAt(i)))
                hmap.put(temp.charAt(i), hmap.get(temp.charAt(i)) - 1);
        }
        int idx = 1;
        for (int i = 1; i <= s.length() - mid; i++) {
            boolean allZero = true;
            for (Character ch : hmap.keySet()) {
                if (hmap.get(ch) > 0) {
                    allZero = false;
                    break;
                }
            }
            if (allZero)
                return new Pair(true, temp);
            if (hmap.containsKey(temp.charAt(0))) {
                hmap.put(temp.charAt(0), hmap.get(temp.charAt(0)) + 1);
            }
            temp = s.substring(i, i + mid);
            if (hmap.containsKey(temp.charAt(mid - 1))) {
                hmap.put(temp.charAt(mid - 1), hmap.get(temp.charAt(mid - 1)) - 1);
            }
        }
        boolean allZero = true;
        for (Character ch : hmap.keySet()) {
            if (hmap.get(ch) > 0) {
                allZero = false;
                break;
            }
        }
        if (allZero)
            return new Pair(true, temp);
        return new Pair(false, "");
    }
}