// Last updated: 8/7/2025, 2:59:04 PM
class Solution {
    //in this we need to. make t equal to s (subsequences) so if we have non same charcter so me wake i yo shift left wothout shifting j (as its target) if we have same charcter so we left with 2 option either to chose this cahrcater so not(untill the charcter is not equal eith that of j) so for sake charcter we will find to call and extea func that shifgts both i and j to left means we chose that very charcter
    int ans = 0;
    int dp[][];

    int find(String s, String t, int i, int j) {
        if (j < 0) {
            ans++;
            return 1;
        }
        if (i < 0)
            return 0;
        int f = 0;
        if (dp[i][j] != -1)
            return dp[i][j];
        if (s.charAt(i) == t.charAt(j)) {
            //chose
            f = dp[i][j] = find(s, t, i - 1, j - 1);
        }
        return dp[i][j] = find(s, t, i - 1, j) + f;
    }

    public int numDistinct(String s, String t) {
        dp = new int[s.length()][t.length()];
        for (int i[] : dp) {
            Arrays.fill(i, -1);
        }
        return find(s, t, s.length() - 1, t.length() - 1);
        //return ans;
    }
}