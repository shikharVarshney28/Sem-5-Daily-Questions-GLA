// Last updated: 8/7/2025, 2:51:31 PM
class Solution {
    public int subtractProductAndSum(int n) {
        int pro = 1, sum = 0;
        while (n != 0) {
            pro *= (n % 10);
            sum += (n % 10);
            n /= 10;
        }
        return pro - sum;
    }
}