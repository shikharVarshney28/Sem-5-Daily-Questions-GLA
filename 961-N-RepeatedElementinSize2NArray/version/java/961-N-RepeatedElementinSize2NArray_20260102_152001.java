// Last updated: 1/2/2026, 3:20:01 PM
1class Solution {
2    public int repeatedNTimes(int[] nums) {
3        HashMap<Integer, Integer> hmap = new HashMap<>();
4        for (int i : nums) {
5            hmap.put(i, hmap.getOrDefault(i, 0) + 1);
6        }
7        int n = nums.length / 2;
8        for (int i : hmap.keySet()) {
9            if (hmap.get(i) >= n)
10                return i;
11        }
12        return -1;
13    }
14}