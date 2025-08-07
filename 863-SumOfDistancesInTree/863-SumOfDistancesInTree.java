// Last updated: 8/7/2025, 2:53:18 PM
class Solution {
    public int[] sumOfDistancesInTree(int n, int[][] edges) {
        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }
        for (int edge[] : edges) {
            adjList.get(edge[0]).add(edge[1]);
            adjList.get(edge[1]).add(edge[0]);
        }
        return find(adjList, 0, n);
    }

    private static int[] find(List<List<Integer>> adjList, int src, int n) {
        int followingChild[] = new int[n];
        findFollowingChild(adjList, 0, new boolean[n], followingChild);
        int totalPath = findTotalPath(adjList, 0, n);
        int[] ans = new int[n];
        Arrays.fill(ans, -1);
        ans[0] = totalPath;

        findFinal(adjList, 0, n, ans, followingChild);
        return ans;
    }

    private static void findFinal(List<List<Integer>> adjList, int src, int n, int[] ans, int[] followingChild) {
        for (int i : adjList.get(src)) {
            if (ans[i] != -1)
                continue;
            ans[i] = ans[src] - (followingChild[i]) + (n - followingChild[i]);
            findFinal(adjList, i, n, ans, followingChild);
        }
    }

    private static int findTotalPath(List<List<Integer>> adjList, int src, int n) {
        Queue<int[]> qu = new LinkedList<>();
        qu.add(new int[] { 0, 0 });
        int total = 0;
        boolean vis[] = new boolean[n];
        vis[src] = true;
        while (!qu.isEmpty()) {
            int t[] = qu.poll();
            total += t[1];
            for (int i : adjList.get((t[0]))) {
                if (vis[i])
                    continue;
                vis[i] = true;
                qu.add(new int[] { i, t[1] + 1 });
            }
        }
        return total;
    }

    private static int findFollowingChild(List<List<Integer>> adjList, int src, boolean vis[], int followingChild[]) {
        int ans = 0;
        vis[0] = true;
        for (int i : adjList.get(src)) {
            if (vis[i])
                continue;
            vis[i] = true;
            ans += findFollowingChild(adjList, i, vis, followingChild);
        }
        return followingChild[src] = ans + 1;
    }
}