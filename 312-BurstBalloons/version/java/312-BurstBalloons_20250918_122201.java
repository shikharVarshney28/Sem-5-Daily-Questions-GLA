// Last updated: 9/18/2025, 12:22:01 PM
class Solution {
    Integer[][] dp;

    public int maxCoins(int[] nums) {
        int arr[] = new int[nums.length + 2];
        arr[0] = arr[arr.length - 1] = 1;
        for (int i = 1; i <= nums.length; i++)
            arr[i] = nums[i - 1];
        dp = new Integer[arr.length][arr.length];
        return burstCoins(arr, 0, arr.length - 1);
    }

    int burstCoins(int[] arr, int i, int j) {
        if (i + 1 == j)
            return 0;
        if (dp[i][j] != null)
            return dp[i][j];
        int ans = Integer.MAX_VALUE + 1;
        for (int k = i + 1; k < j; k++) {
            int leftBurst = burstCoins(arr, i, k);
            int rightBurst = burstCoins(arr, k, j);
            int selfBurst = arr[i] * arr[j] * arr[k];
            ans = Math.max(ans, leftBurst + rightBurst + selfBurst);
        }
        return dp[i][j] = ans;
    }
}