// Last updated: 8/7/2025, 2:52:29 PM
class Solution {
    public int findJudge(int n, int[][] trust) {
        int incomming[] = new int[n + 1];
        int outgoing[] = new int[n + 1];
        for (int t[] : trust) {
            incomming[t[1]]++;
            outgoing[t[0]]++;
        }
        int ans = -1;
        for (int i = 1; i <= n; i++) {
            if (incomming[i] == (n - 1) && outgoing[i] == 0)
                return i;
        }
        return -1;
    }
}