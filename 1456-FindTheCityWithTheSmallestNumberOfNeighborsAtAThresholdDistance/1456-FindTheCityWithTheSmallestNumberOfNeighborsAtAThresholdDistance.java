// Last updated: 8/7/2025, 2:51:15 PM
class Solution {
    int find(List<List<int[]>> adjList, int src, int n, int th) {
        PriorityQueue<int[]> qu = new PriorityQueue<>((a,b)->(a[2]-b[2]));
        qu.add(new int[] { src, -1, 0 });
        int nodes = 0;
        boolean vis[] = new boolean[n];
        while (!qu.isEmpty()) {
            int t[] = qu.poll(); //[itself,parent,path]
            if(vis[t[0]]) continue;
            vis[t[0]]=true;
            nodes++;
            for (int child[] : adjList.get(t[0])) {
                if (child[0] == t[1] || vis[child[0]] || t[2] + child[1] > th)
                    continue;
                qu.add(new int[] { child[0], t[0],child[1]+t[2]});
            }
        }
        return nodes;
    }

    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        List<List<int[]>> adjList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }
        for (int i[] : edges) {
            adjList.get(i[0]).add(new int[] { i[1], i[2] });
            adjList.get(i[1]).add(new int[] { i[0], i[2] });
        }
        int largestNode = -1, smallestCount = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int nodes = find(adjList, i, n, distanceThreshold);
            if (smallestCount > nodes) {
                smallestCount = nodes;
                largestNode = i;
            } else if(smallestCount == nodes) {
                largestNode = Math.max(largestNode, i);
            }
          //System.out.println(i + " " + nodes);
        }
        return largestNode;
    }
}