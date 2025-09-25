// Last updated: 9/25/2025, 4:50:40 PM
class Solution {
    public int earliestTime(int[][] tasks) {
        int ans = Integer.MAX_VALUE;
        for (int[] i : tasks) {
            ans = Math.min(ans, i[0] + i[1]);
        }
        return ans;
    }
}