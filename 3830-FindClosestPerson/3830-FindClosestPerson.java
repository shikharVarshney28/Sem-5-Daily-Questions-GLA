// Last updated: 8/7/2025, 2:43:25 PM
class Solution {
    public int findClosest(int x, int y, int z) {
        int posX = Math.abs (z - x);
        int posY = Math.abs(z - y);
        if(posX == posY) return 0;
        if(posX > posY) return 2;
        return 1;
    }
}