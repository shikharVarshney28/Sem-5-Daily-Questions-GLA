// Last updated: 12/30/2025, 10:38:24 AM
1class Solution {
2    public int minCost(int n, int[][] edges) {
3        List<List<int[]>> adj = new ArrayList<>();
4        int d[] = new int[n];
5        for (int i = 0; i < n; i++) {
6            adj.add(new ArrayList<>());
7        }
8        for (int[] i : edges) {
9            adj.get(i[0]).add(new int[] { i[1], i[2] });
10            adj.get(i[1]).add(new int[] { i[0], i[2] * 2 }); // reverse path
11        }
12        if (adj.get(n - 1).size() == 0)
13            return -1;
14        Arrays.fill(d, Integer.MAX_VALUE);
15        d[0] = 0;
16        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);
17        pq.add(new int[] { 0, 0 });
18        while (pq.size() > 0) {
19            int t[] = pq.poll();
20            if (t[0] == n - 1)
21                return t[1];
22            if (d[t[0]] < t[1])
23                continue;
24            for (int i[] : adj.get(t[0])) {
25                // dist u + w < dist v
26                if (t[1] + i[1] < d[i[0]]) {
27                    d[i[0]] = t[1] + i[1];
28                    pq.add(new int[] { i[0], i[1] + t[1] });
29                }
30            }
31        }
32        return -1;
33    }
34}