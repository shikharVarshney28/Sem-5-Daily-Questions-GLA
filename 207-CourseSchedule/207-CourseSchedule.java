// Last updated: 8/7/2025, 2:57:36 PM
class Solution {
    boolean track[];
    public boolean canFinish(int n, int[][] edges) {
        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }
        track=new boolean[n];
        for (int edge [] : edges) {
            adjList.get(edge[1]).add(edge[0]);
        }
        System.out.println (adjList);
        for (int i = 0; i < n; i++) {
            if (findCycle(n, i, adjList)) {
                return false;
            }
            track[i]=true;
        }
        return true;
    }

    boolean findCycle(int n, int src, List<List<Integer>> adjList) {
        boolean vis[] = new boolean[n];
        Queue<Integer> qu = new LinkedList<>();
        qu.add(src);
        vis[src]=true;
        while(!qu.isEmpty()){
            int t=qu.poll ();
            //vis[t]=true;
            for(int i:adjList.get (t)){
                if(i==src)return true;
                if(vis[i] || (track[i] && i<t)) continue;
                vis[i]=true;
                qu.add (i);
            }
        }
        return false;
    }
}





