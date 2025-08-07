// Last updated: 8/7/2025, 2:49:16 PM
class Solution {
    public int findCenter(int[][] edges) {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        for (int i[] : edges) {
            hmap.put(i[0], hmap.getOrDefault(i[0], 0) + 1);
            if (hmap.get(i[0]) > 1)
                return i[0];
            hmap.put(i[1], hmap.getOrDefault(i[1], 0) + 1);
            if (hmap.get(i[1]) > 1)
                return i[1];
        }
        return -1;
    }
}