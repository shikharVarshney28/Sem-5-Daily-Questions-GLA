// Last updated: 8/7/2025, 2:55:23 PM
class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a, b) -> (a[1] <= b[1]) ? -1 : 1);
        int arrows = 1, lastTime = points[0][1];
        for (int i = 1; i < points.length; i++) {
            if (lastTime < points[i][0]) {
                arrows++;
                lastTime = points[i][1];
            }
        }
        return arrows;
    }
}