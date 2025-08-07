// Last updated: 8/7/2025, 2:47:35 PM
class Solution {
    //Sprt the queue level wise and index wise *as per ques we need to return smallest idx * 
    // we need to add all the xhild leveswise sorted on index and then we need to apply logic
    int find(int[] adjList, int color[], int n, int m) {
        PriorityQueue<int[]> qu = new PriorityQueue<>(new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                if (a[1] == b[1])
                    return a[0] - b[0];
                return a[1] - b[1];
            }
        });
        qu.add(new int[] { n, 0, 1 });
        qu.add(new int[] { m, 0, -1 });
        while (qu.size() > 0) {
            int t[] = qu.poll();
            if (t[0] == -1)
                continue;
            if (color[t[0]] != 0) {
                if (color[t[0]] != t[2])
                    return t[0];
                continue;
            }
            color[t[0]] = t[2];
            qu.add(new int[] { adjList[t[0]], t[1] + 1, t[2] });
        }
        return -1;
    }

    public int closestMeetingNode(int[] edges, int node1, int node2) {
        if (node1 == node2)
            return node1;
        List<List<Integer>> adjList = new ArrayList<>();
        int n = edges.length;
        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }
        return find(edges, new int[n], node1, node2);
    }
}