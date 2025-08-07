// Last updated: 8/7/2025, 2:50:18 PM
class Solution {
    boolean itsPossible(int i, int j, int k, int a, int b, int c) {
        if ((Math.abs(i - j) <= a) && (Math.abs(j - k) <= b) && (Math.abs(i - k) <= c))
            return true;
        return false;

    }

    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (itsPossible(arr[i], arr[j], arr[k], a, b, c))
                        count++;
                }
            }
        }
        return count;
    }
}