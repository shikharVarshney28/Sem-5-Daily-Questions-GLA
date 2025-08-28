// Last updated: 8/28/2025, 11:48:31 AM
class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int maxArea = 0;
        double maxDiagArea = 0.0;
        for (int dimension[] : dimensions) {
            double val = Math.sqrt(Math.pow(dimension[0], 2) + Math.pow(dimension[1], 2));
            if (val > maxDiagArea) {
                maxDiagArea = val;
                maxArea = dimension[0] * dimension[1];
            } else if (val == maxDiagArea) {
                // as per ques : If there are multiple rectangles with the longest diagonal, return the area of the rectangle having the maximum area.
                maxArea = Math.max(maxArea, dimension[0] * dimension[1]);
            }
        }
        return maxArea;
    }
}