// Last updated: 8/7/2025, 2:57:41 PM
class Solution {
    public int countPrimes(int n) {
        if (n < 2)
            return 0;
        int arr[] = new int[n];
        // 0 and 1 are not prime so denote it by -1;
        arr[0] = arr[1] = -1;
        for (int i = 2; i * i < n; i++) {
            if (arr[i] == 0) {
                // this idx / ele is not prime so plac e-1 to its multiple
                for (int j = 2; i * j < n; j++) {
                    arr[i * j] = -1;
                }
            }
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != -1)
                count++;
        }
        return count;
    }
}