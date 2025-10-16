// Last updated: 10/16/2025, 10:42:18 AM
class Solution {
    public boolean scoreBalance(String s) {
        int totalSum = 0;
        for (char ch : s.toCharArray()) {
            totalSum += (ch - 'a' + 1);
        }
        System.out.print(totalSum);
        int leftSum = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            leftSum += (s.charAt(i) - 'a' + 1);
            int rightSum = totalSum - leftSum;
            if (leftSum == rightSum)
                return true;
            if (rightSum < leftSum)
                break;
        }
        return false;
    }
}