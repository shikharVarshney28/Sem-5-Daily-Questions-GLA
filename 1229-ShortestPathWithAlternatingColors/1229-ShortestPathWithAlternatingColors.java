// Last updated: 8/7/2025, 2:52:02 PM
class Solution {
    //1. to avoid looping we add one one paramenter to adj int[] i.e 3rd ind whther this btanch is used or not
    //2. Write Dijkastra algo as it as..
    /*
    2.1 ) As pwrr ques we need to have alter oath so before adding in pq check whether the source and its child have different color and is not visted...
          add in pq and mark chold[2]=1 //used
          now use relaxation form seperatly to update the cost do not include in main cond
          because we need to travell all paths as per some testcase and putting rexaltion form in main cind will not cause it....
          so cost will be updated when relation form cond is hitted
          Do ommitt the cond dist[u]<t[0]
    otherwise the remaining path withh not be added like 
    red orah 0-1-2-3 blue path 3-1...
    
    
    */
    public int[] shortestAlternatingPaths(int n, int[][] redEdges, int[][] blueEdges) {
        List<List<int[]>> adjList = new ArrayList<>();
        for (int i = 0; i < n; i++)
            adjList.add(new ArrayList<>());
        for (int i[] : redEdges) {
            adjList.get(i[0]).add(new int[] { i[1], 1, -1 });
        }
        for (int i[] : blueEdges) {
            adjList.get(i[0]).add(new int[] { i[1], -1, -1 });
        }
        return dijkastra(adjList, 0, n);
    }

    private static int[] dijkastra(List<List<int[]>> adjList, int src, int n) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> (a[1] - b[1]));
        pq.add(new int[] { 0, 0, 0 });
        // int currColor[]=new int[n];
        int dist[] = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[0] = 0;
        while (!pq.isEmpty()) {
            int t[] = pq.poll();
            //System.out.println(t[0]);
            //if(t[1]>dist[t[0]]) continue;
            for (int i[] : adjList.get(t[0])) {
                if (i[2] != 1 && (t[0] == 0 || t[2] != i[1])) {
                    if (dist[t[0]] + t[1] < dist[i[0]])
                        dist[i[0]] = t[1] + 1;
                    pq.add(new int[] { i[0], t[1] + 1, i[1] });
                    i[2] = 1;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if (dist[i] == Integer.MAX_VALUE)
                dist[i] = -1;
        }
        return dist;
    }
}