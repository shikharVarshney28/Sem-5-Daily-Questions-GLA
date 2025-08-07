// Last updated: 8/7/2025, 2:51:27 PM
class Solution {
    public int findNumbers(int[] nums) {
        int evenNumOfDigits = 0;
        for (int i : nums) {
            if ((i >= 10 && i < 100) || (i >= 1000 && i < 10000) || (i >= 100000 && i <= 999999)) {
                evenNumOfDigits++;
            }
        }
        return evenNumOfDigits;
    }
}