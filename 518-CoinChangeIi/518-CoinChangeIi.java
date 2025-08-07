// Last updated: 8/7/2025, 2:54:56 PM
class Solution {
    static int dp[][];

    public int change(int amount, int[] coins) {
        // Arrays.sort(coins);
        dp = new int[coins.length][amount + 1];
        for (int[] i : dp)
            Arrays.fill(i, -1);
        return (find(coins, amount, 0));
    }

    private static int find(int[] arr, int target, int idx) {
        if (target == 0)
            return 1;
        if (idx >= arr.length) {
            return 0;
        }
        if (dp[idx][target] != -1)
            return dp[idx][target];
        int chosen = 0;
        if (arr[idx] <= target) {
            chosen = find(arr, target - arr[idx], idx);
        }
        int notChosen = find(arr, target, idx + 1);
        return dp[idx][target] = chosen + notChosen;
    }
}