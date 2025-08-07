// Last updated: 8/7/2025, 2:53:55 PM
class Solution {
    class Pair {
        int to;
        int cost;

        Pair(int to, int cost) {
            this.to = to;
            this.cost = cost;
        }

        public String toString() {
            return "( " + to + " , " + cost + " )";
        }
    }

    public int networkDelayTime(int[][] times, int n, int k) {
        PriorityQueue<Pair> pq = new PriorityQueue<>(new Comparator<Pair>() {
            public int compare(Pair a, Pair b) {
                return b.cost - a.cost;
            }
        });
        List<List<Pair>> adjList = new ArrayList<>();
        for (int i = 1; i <= n + 1; i++)
            adjList.add(new ArrayList<>());
        for (int time[] : times) {
            adjList.get(time[0]).add(new Pair(time[1], time[2]));
        }
        pq.add(new Pair(k, 0));
        boolean vis[] = new boolean[n + 1];
        int cost[] = new int[n + 1];
        Arrays.fill(cost, Integer.MAX_VALUE);
        cost[k] = 0;
        while (!pq.isEmpty()) {
            int size = pq.size();
            Pair p = pq.poll();
            for (Pair neigh: adjList.get(p.to)){
                // dist[u] + dist < dist[v] or source + source to dest < dest
                int distU = p.cost, dist = neigh.cost;
                if(distU + dist < cost[neigh. to]){
                    cost[neigh.to] = distU + dist;
                    pq.add (new Pair(neigh.to, cost[neigh.to]));
                }

            }
        }
        int ans = 0;
        for (int i = 1; i <= n; i++)
            ans = Math.max(ans, cost[i]);
        return (ans == Integer.MAX_VALUE) ? -1 : ans;

    }
}