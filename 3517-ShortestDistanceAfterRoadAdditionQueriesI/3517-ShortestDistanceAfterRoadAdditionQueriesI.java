// Last updated: 8/7/2025, 2:44:29 PM
class Solution {
    public int[] shortestDistanceAfterQueries(int n, int[][] queries) {
        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }
        for (int i = 0; i < n - 1; i++) {
            adjList.get(i).add(i + 1);
        }
        int ans[] = new int[queries.length];
        int idx = 0;
        for (int query[] : queries) {
            adjList.get(query[0]).add(query[1]);
            Queue<Integer> qu = new LinkedList<>();
            boolean vis[]=new boolean [n];
            qu.add(0);
            int level = 0;
            while (!qu.isEmpty()) {
                int size = qu.size();
                for (int i = 0; i < size; i++) {
                    int src=qu.poll ();
                    vis[src]=true;
                    if(src==n -1){
                        qu=new LinkedList <>();
                        break;
                    }
                    for (int child : adjList.get(src)) {
                        if (qu.contains(child) || vis[child])
                            continue;
                        qu.add(child);
                    }
                }
                level++;
            }
            ans[idx++] = level-1;
        }
        return ans;
    }
}
