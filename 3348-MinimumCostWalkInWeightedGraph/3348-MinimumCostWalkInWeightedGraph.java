// Last updated: 8/7/2025, 2:45:13 PM
class Solution {
    public int[] minimumCost(int n, int[][] edges, int[][] query) {
        int colorArray[] = new int[n];
        List<List<int[]>> adjList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }
        for (int edge[] : edges) {
            adjList.get(edge[0]).add(new int[] { edge[1], edge[2] });
            adjList.get(edge[1]).add(new int[] { edge[0], edge[2] });
        }
        int cnt = 1;
        HashMap<Integer, Integer> colorInfo = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (colorArray[i] != 0)
                continue;
            int val = color(i, colorArray, cnt, adjList);
            colorInfo.put(cnt, val);
            cnt++;
        }
        int res[] = new int[query.length];
        for (int i = 0; i < query.length; i++) {
            if (colorArray[query[i][0]] != colorArray[query[i][1]]) {
                res[i] = -1;
            } else {
                res[i] = colorInfo.get(colorArray[query[i][0]]);
            }
        }
        return res;
    }

    int color(int src, int colorArray[], int cnt, List<List<int[]>> adjList) {
        Queue<Integer> qu = new LinkedList<>();
        int ans = Integer.MAX_VALUE;
        qu.add(src);
        while (!qu.isEmpty()) {
            int nsrc = qu.poll();
            colorArray[nsrc] = cnt;
            for (int i[] : adjList.get(nsrc)) {
                if (colorArray[i[0]] != 0)
                    continue;
                ans &= i[1];
                qu.add(i[0]);
            }
        }
        return ans;
    }
}