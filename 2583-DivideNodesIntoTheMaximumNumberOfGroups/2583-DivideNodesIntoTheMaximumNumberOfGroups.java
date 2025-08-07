// Last updated: 8/7/2025, 2:46:51 PM
class Solution {
    boolean isBipartite(int src, List<List<Integer>> adjList, int[] color) {
        // now play holi with neighbour
        for (int neighbour : adjList.get(src)) {
            if (color[neighbour] == color[src])
                return true;
            if (color[neighbour] != 0)
                continue;
            color[neighbour] = -1 * color[src];
            if (isBipartite(neighbour, adjList, color))
                return true;
        }
        return false;
    }

    public int magnificentSets(int n, int[][] edges) {
        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            adjList.add(new ArrayList<>());
        }
        for (int edge[] : edges) {
            adjList.get(edge[0]).add(edge[1]);
            adjList.get(edge[1]).add(edge[0]);
        }
        int color[] = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            // if already colored
            if (color[i] != 0)
                continue;
            // lets play holi
            color[i] = 1;
            if (isBipartite(i, adjList, color))
                return -1;

        }
        int maxGrps[] = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            maxGrps[i] = bfs(i, adjList, new boolean[n + 1]);
        }
        boolean vis[] = new boolean[n + 1];
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            if (!vis[i]) {
                ans += getMaxGrp(i, adjList, maxGrps, vis);
            }
        }
        return ans;
    }

    int bfs(int src, List<List<Integer>> adjList, boolean vis[]) {
        Queue<Integer> qu = new LinkedList<>();
        int grp = 1;
        qu.add(src);
        while (!qu.isEmpty()) {
            int size = qu.size();
            for (int i = 0; i < size; i++) {
                int t = qu.poll();
                vis[t]=true;
                for (int child : adjList.get(t)) {
                    if (vis[child])
                        continue;
                    vis[child] = true;
                    qu.add(child);
                }
            }
            grp++;
        }
        return grp - 1;
    }

    int getMaxGrp(int src, List<List<Integer>> adjList, int[] freq, boolean vis[]) {
        vis[src] = true;
        int max = Integer.MIN_VALUE;
        for (int i : adjList.get(src)) {
            if (vis[i])
                continue;
            max = Math.max(max, getMaxGrp(i, adjList, freq, vis));
        }
        return Math.max(max, freq[src]);
    }
}