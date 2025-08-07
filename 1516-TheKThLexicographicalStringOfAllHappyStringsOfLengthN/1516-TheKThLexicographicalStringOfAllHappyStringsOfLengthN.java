// Last updated: 8/7/2025, 2:50:48 PM
class Solution {
    void FindString(String s, ArrayList arr, int n, int idx) {
        if (idx >= 2 && s.charAt(idx - 1) == s.charAt(idx - 2))
            return;
        if (s.length() == n) {

            arr.add(s);
            return;
        }
        FindString(s + 'a', arr, n, idx + 1);
        FindString(s + 'b', arr, n, idx + 1);
        FindString(s + 'c', arr, n, idx + 1);
    }

    public String getHappyString(int n, int k) {
        ArrayList<String> arr = new ArrayList<>();
        FindString("", arr, n, 0);
        // System.out.println(arr);
        return k <= arr.size() ? arr.get(k - 1) : "";
    }
}