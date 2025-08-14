// Last updated: 8/14/2025, 10:40:24 AM
class Solution {
    int dp[][];
    int mod = (int) Math.pow(10, 9) + 7;

    int find(int n, int x, int idx) {
        if (n == 0)
            return 1;
        if (n < 0)
            return 0;
        if (dp[n][idx] != -1)
            return dp[n][idx];
        int ans = 0;
        for (int i = idx;pow(i,x)<=n; i++) {
            int val = pow(i, x);
            
            ans = (ans + (find(n - val, x, i + 1) % mod)) % mod;
        }
        return dp[n][idx] = ans;
    }

    public int numberOfWays(int n, int x) {
        dp = new int[n + 1][n + 1];
        for (int i[] : dp)
            Arrays.fill(i, -1);
        return find(n, x, 1);
    }

    int pow(int a, int b) {
        int p = 1;
        for (int i = 0; i < b; i++)
            p *= a;
        return p;
    }
}