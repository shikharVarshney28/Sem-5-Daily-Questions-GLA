// Last updated: 8/7/2025, 2:49:22 PM
class Solution {
    public boolean checkPowersOfThree(int n) {
        while (n != 0) {
            if (n % 3 > 1)
                return false;
            n /= 3;
        }
        return true;
    }
}