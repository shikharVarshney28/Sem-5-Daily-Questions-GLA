// Last updated: 8/20/2025, 10:57:42 AM
class Solution {
    public String largestGoodInteger(String num) {
        int count[] = new int[num.length()];
        count[0] = 1;
        for (int i = 1; i < num.length(); i++) {
            if (num.charAt(i) != num.charAt(i - 1)) {
                count[i] = 1;
            } else {
                count[i] = count[i - 1] + 1;
            }
        }

        int i = 0;
        String s = "";
        while (i + 3 <= num.length()) {
            String sub = num.substring(i, i + 3);

            if (count[i + 2] == 3 && s.compareTo(sub) < 0) {
                s = sub;
            }
            i++;
        }
        return s;
    }
}