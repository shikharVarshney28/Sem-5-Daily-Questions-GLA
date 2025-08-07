// Last updated: 8/7/2025, 2:51:53 PM
class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                if (i + 1 < n && arr[i + 1] % 2 != 0 && i + 2 < n && arr[i + 2] % 2 != 0)
                    return true;
            }
        }
        return false;
    }
}