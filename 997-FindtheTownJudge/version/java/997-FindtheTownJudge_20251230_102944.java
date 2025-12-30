// Last updated: 12/30/2025, 10:29:44 AM
1class Solution {
2    public int findJudge(int n, int[][] trust) {
3        int incomming[] = new int[n + 1];
4        int outgoing[] = new int[n + 1];
5        for (int t[] : trust) {
6            incomming[t[1]]++;
7            outgoing[t[0]]++;
8        }
9        int ans = -1;
10        for (int i = 1; i <= n; i++) {
11            if (incomming[i] == (n - 1) && outgoing[i] == 0)
12                return i;
13        }
14        return -1;
15    }
16}