// Last updated: 8/7/2025, 2:52:56 PM
class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        int left = 0, ans = 0;
        for (int i = 0; i < fruits.length; i++) {
            if (hmap.containsKey(fruits[i])) {
                hmap.put(fruits[i], hmap.get(fruits[i]) + 1);
            } else {
                if (hmap.size() < 2) {
                    hmap.put(fruits[i], 1);
                } else {
                    ans = Math.max(ans, i - left);
                    while (left < i && hmap.size() == 2) {
                        int val = hmap.get(fruits[left]);
                        if (val - 1 == 0)
                            hmap.remove(fruits[left]);
                        else
                            hmap.put(fruits[left], val - 1);
                        left++;
                    }
                    hmap.put(fruits[i], 1);
                }
            }
        }
        return Math.max(ans, fruits.length - left);
    }
}