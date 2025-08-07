// Last updated: 8/7/2025, 2:44:51 PM
class Solution {
    public int countDays(int days, int[][] meetings) {
        Arrays.sort(meetings, (a, b) -> a[0] - b[0]);
        int interval[] = meetings[0];
        int ans = (interval[0] - 1);
        for (int i = 1; i < meetings.length; i++) {
            if (interval[0] <= meetings[i][0] && meetings[i][0] <= interval[1]) {
                // inc the interval as this curr interval lies within the prev interval i.i.e
                // inyerval array range....
                interval[1] = Math.max(interval[1], meetings[i][1]);
            } else {
                // introduce new interval and find the no od days of free btw this break by the
                // formula i.i.e no of free days btw 7th day and 5th day is the 6th day i.i.e 7
                // - 5 = 2 (doing minuns 1 by ourside) = 1 hence add thsi in ans;
                ans += (meetings[i][0] - interval[1] - 1);
                interval = meetings[i];
            }
        }
        ans += (days - interval[1]);
        return ans;
    }

}