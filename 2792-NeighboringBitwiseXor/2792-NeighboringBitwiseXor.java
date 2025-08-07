// Last updated: 8/7/2025, 2:46:09 PM
class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int xor = derived[0];
        for (int i = 1; i < derived.length; i++) {
            xor ^= derived[i];
        }
        return xor == 0;
    }
}