// Last updated: 8/7/2025, 2:53:33 PM
class Solution {
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int color[] = new int[n];
        Arrays.fill(color, -1);
        for (int i = 0; i < n; i++) {
            if (color[i] != -1)
                continue;
            if (isNotBipartite(graph, color, i))
                return false;
        }
        return true;
    }

    boolean isNotBipartite(int[][] graph, int color[], int src) {
        Queue<Integer> qu = new LinkedList<>();
        qu.add(src);
        color[src] = 0; // bydefault
        while (!qu.isEmpty()) {
            int nsrc = qu.poll();
            for (int child : graph[nsrc]) {
                if (color[child] == color[nsrc])
                    return true;
                    if(color[child] != -1) continue;
                color[child] = 1 - color[nsrc];
                qu.add(child);
            }
        }
        return false;
    }
}