// Last updated: 11/19/2025, 12:33:18 PM
class Solution {
    public long removeZeros(long n) {
        String ans = "";
        while (n > 0) {
            if (n % 10 != 0)
                ans = n % 10 + ans;
            n /= 10;

        }
        return Long.parseLong(ans);
    }
}