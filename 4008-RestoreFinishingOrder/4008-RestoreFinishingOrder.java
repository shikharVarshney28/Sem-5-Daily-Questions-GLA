// Last updated: 9/3/2025, 10:45:13 AM
class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        HashSet<Integer> hSet = new HashSet<>();
        for (int i : friends)
            hSet.add(i);
        int ans[] = new int[friends.length];
        int idx = 0, ansIdx = 0;
        while (idx < order.length) {
            if (hSet.contains(order[idx])) {
                ans[ansIdx++] = order[idx];

            }
            idx++;
        }
        return ans;
    }
}