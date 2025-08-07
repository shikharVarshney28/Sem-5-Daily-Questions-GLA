// Last updated: 8/7/2025, 2:49:08 PM
class Solution {
    public String sortSentence(String s) {
        String[] arr = s.split(" ");
        Arrays.sort(arr, new Comparator<String>() {
            public int compare(String a, String b) {
                return a.charAt(a.length() - 1) - b.charAt(b.length() - 1);
            }
        });
        String ans = "";
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1) {
                ans = ans + arr[i].substring(0, arr[i].length() - 1) + " ";
            } else
                ans = ans + arr[i].substring(0, arr[i].length() - 1);
        }
        return ans;
    }
}