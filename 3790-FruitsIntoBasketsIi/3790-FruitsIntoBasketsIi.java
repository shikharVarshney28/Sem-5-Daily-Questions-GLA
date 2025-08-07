// Last updated: 8/7/2025, 2:43:38 PM
class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        boolean used[] = new boolean[fruits.length];
        int unused = 0;
        for (int i : fruits) {
            int j = 0;
            for (; j < fruits.length; j++) {
                if (!used[j] && i <= baskets[j])
                    break;
            }
            if (j != fruits.length) {
                used[j] = true;
            } else
                unused++;
        }
        return unused;
    }
}