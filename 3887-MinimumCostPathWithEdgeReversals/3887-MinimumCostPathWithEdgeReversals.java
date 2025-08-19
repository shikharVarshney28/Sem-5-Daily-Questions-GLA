// Last updated: 8/19/2025, 4:59:27 PM
class Solution {
    public int minCost(int n, int[][] edges) {
        List<List<int[]>> adj = new ArrayList<>();
        int d[] = new int[n];
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] i : edges) {
            adj.get(i[0]).add(new int[] { i[1], i[2] });
            adj.get(i[1]).add(new int[] { i[0], i[2] * 2 }); // reverse path
        }
        if (adj.get(n - 1).size() == 0)
            return -1;
        Arrays.fill(d, Integer.MAX_VALUE);
        d[0] = 0;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);
        pq.add(new int[] { 0, 0 });
        while (pq.size() > 0) {
            int t[] = pq.poll();
            if (t[0] == n - 1)
                return t[1];
            if(d[t[0]]<t[1]) continue;            for (int i[] : adj.get(t[0])) {
                // dist u + w < dist v
                if (t[1] + i[1] < d[i[0]]) {
                    d[i[0]] =t[1] + i[1];
                    pq.add(new int[] { i[0], i[1] + t[1] });
                }
            }
        }
        return -1;
    }
}