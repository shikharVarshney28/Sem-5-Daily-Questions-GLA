// Last updated: 8/28/2025, 11:46:50 AM
class Solution {
    public int gcdOfOddEvenSums(int n) {
        int oddSum = 0, evenSum = 0;
        for (int i = 1; i <= n; i++)
            oddSum += (2 * i - 1);
        for (int i = 1; i <= n; i++)
            evenSum += 2 * i;
        return gcd(oddSum, evenSum);
    }

    int gcd(int x, int y) {
        if (y == 0)
            return x;
        return gcd(y, x % y);
    }
}