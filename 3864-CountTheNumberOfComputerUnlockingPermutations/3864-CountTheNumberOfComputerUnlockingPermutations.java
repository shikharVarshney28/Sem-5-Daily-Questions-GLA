// Last updated: 8/7/2025, 2:43:12 PM
class Solution {
    public int countPermutations(int[] complexity) {
        int c = complexity[0];
        for (int i = 1; i < complexity.length; i++) {
            if (complexity[i] <= c)
                return 0;
        }
        long ans = 1;
        for (int i = 1; i < complexity.length; i++) {
            ans = (ans * i) % ((int) Math.pow(10, 9) + 7);
        }
        return (int) ans;
    }
}