// Last updated: 8/7/2025, 2:49:12 PM
class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
        int ans[] = new int[queries.length];
        int idx = 0;
        for (int i[] : queries) {
            int c = 0;
            for (int point[] : points) {
                int x = (int) Math.ceil(Math.pow((i[0] - point[0]), 2));
                int y = (int) Math.ceil(Math.pow((i[1] - point[1]), 2));
                if ((int) Math.ceil(Math.sqrt(x + y)) <= i[2])
                    c++;
            }
            ans[idx++] = c;
        }
        return ans;
    }
}