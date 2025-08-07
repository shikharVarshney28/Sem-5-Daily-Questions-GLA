// Last updated: 8/7/2025, 2:46:38 PM
class Solution {
    public long coloredCells(int n) {
        long r = n;
        return 1 + (r - 1) * r * 2;
    }
}