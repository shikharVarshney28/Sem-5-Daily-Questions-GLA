// Last updated: 12/30/2025, 10:35:40 AM
1class Solution {
2    //Sprt the queue level wise and index wise *as per ques we need to return smallest idx * 
3    // we need to add all the xhild leveswise sorted on index and then we need to apply logic
4    int find(int[] adjList, int color[], int n, int m) {
5        PriorityQueue<int[]> qu = new PriorityQueue<>(new Comparator<int[]>() {
6            public int compare(int[] a, int[] b) {
7                if (a[1] == b[1])
8                    return a[0] - b[0];
9                return a[1] - b[1];
10            }
11        });
12        qu.add(new int[] { n, 0, 1 });
13        qu.add(new int[] { m, 0, -1 });
14        while (qu.size() > 0) {
15            int t[] = qu.poll();
16            if (t[0] == -1)
17                continue;
18            if (color[t[0]] != 0) {
19                if (color[t[0]] != t[2])
20                    return t[0];
21                continue;
22            }
23            color[t[0]] = t[2];
24            qu.add(new int[] { adjList[t[0]], t[1] + 1, t[2] });
25        }
26        return -1;
27    }
28
29    public int closestMeetingNode(int[] edges, int node1, int node2) {
30        if (node1 == node2)
31            return node1;
32        List<List<Integer>> adjList = new ArrayList<>();
33        int n = edges.length;
34        for (int i = 0; i < n; i++) {
35            adjList.add(new ArrayList<>());
36        }
37        return find(edges, new int[n], node1, node2);
38    }
39}