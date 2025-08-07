// Last updated: 8/7/2025, 2:47:51 PM
class Solution {
    int find(int arr[][]) {
        int m = arr.length, n = arr[0].length;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> (a[2] - b[2]));
        int ans[][] = new int[m][n];
        for (int i[] : ans)
            Arrays.fill(i, Integer.MAX_VALUE);
        ans[0][0] = 0;
        pq.add(new int[] { 0, 0, 0 });
        int dir[][] = { { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 } };
        while (!pq.isEmpty()) {
            int t[] = pq.poll();
            if(ans[t[0]][t[1]]<t[2]) continue;
            for (int[] d : dir) {
                int r = d[0] + t[0], c = d[1] + t[1];
                if (r < 0 || c < 0 || r >= m || c >= n)
                    continue;
                if (ans[t[0]][t[1]] + arr[r][c] < ans[r][c]) {
                    ans[r][c] = ans[t[0]][t[1]] + arr[r][c];
                    pq.add(new int[] { r, c, ans[r][c] });
                }
            }
        }
        return ans[m - 1][n - 1];
    }

    public int minimumObstacles(int[][] grid) {
        return find(grid);
    }
}