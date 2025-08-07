// Last updated: 8/7/2025, 2:55:36 PM
class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> (a[1] - b[1]));
        int ans = 1 ,n = intervals.length;
        int lastTime = intervals[0][1];
        for (int i = 1; i < n; i++) {
            if (intervals[i][0] >= lastTime) {
                ans++;
                lastTime = intervals[i][1];
            }
        }
        return n - ans;
    }
}