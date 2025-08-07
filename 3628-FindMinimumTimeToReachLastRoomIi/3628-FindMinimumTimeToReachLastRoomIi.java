// Last updated: 8/7/2025, 2:44:06 PM
class Solution {
    int find(int[][] arr, int m, int n) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[2] - b[2]);
        pq.add(new int[] { 0, 0, 0, 1 });
        //int time=0;
        int dir[][] = { { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 } };
        long minTime[][] = new long[m][n];
        for (long i[] : minTime)
            Arrays.fill(i, Long.MAX_VALUE);
        while (true) {
            if (pq.peek()[0] == m - 1 && pq.peek()[1] == n - 1)
                break;
            int t[] = pq.poll();
            //System.out.println (t[0]+" "+t[1]+" "+t[2]);       
            if (minTime[t[0]][t[1]] < t[2])
                continue;
            for (int d[] : dir) {
                int r = t[0] + d[0], c = t[1] + d[1];
                if (r < 0 || c < 0 || r >= m || c >= n)
                    continue;
                int time = Math.max(t[2], arr[r][c]) + t[3];
                if (time < minTime[r][c]) {
                    //System.out.println (r+" "+c+" "+time)    ;
                    minTime[r][c] = time;
                    pq.add(new int[] { r, c, time, t[3] % 2 + 1 });
                }
            }
        }
        return pq.peek()[2];
    }

    public int minTimeToReach(int[][] moveTime) {
        int m = moveTime.length, n = moveTime[0].length;
        return find(moveTime, m, n);

    }
}