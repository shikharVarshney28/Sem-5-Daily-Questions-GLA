// Last updated: 8/7/2025, 2:48:25 PM
class Solution {
    public List<Integer> findAllPeople(int n, int[][] meetings, int firstPerson) {
        List<List<int[]>> adjList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }
        boolean connected = false;
        for (int meeting[] : meetings) {
            if ((meeting[0] == 0 || meeting[1] == 0) && (meeting[1] == firstPerson || meeting[00] == firstPerson)) {
                adjList.get(0).add(new int[] { firstPerson, 0 });
                connected = true;
                continue;
            }
            adjList.get(meeting[0]).add(new int[] { meeting[1], meeting[2] });
            adjList.get(meeting[1]).add(new int[] { meeting[0], meeting[2] });
        }
        if (!connected) {
            adjList.get(0).add(new int[] { firstPerson, 0 });
        }
        /*for(int i=0;i<n;i++){
                    System.out.print(i+ " [ ");
                                for(int j[]:adjList.get(i)){
                                                System.out.print("( "+j[0]+" "+j[1]+")");
                                                            }
                                                                        System.out.println ();
                                                                                }*/
        List<Integer> ans = new ArrayList<>();
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);
        int currentMinTime = 0;
        boolean vis[] = new boolean[n];
        pq.add(new int[] { 0, 0 });
        while (!pq.isEmpty()) {
            int[] src = pq.poll();
            if (vis[src[0]])
                continue;
            vis[src[0]] = true;
            currentMinTime = src[1];
            ans.add(src[0]);
            for (int i[] : adjList.get(src[0])) {
                if (vis[i[0]] || currentMinTime > i[1])
                    continue;
                pq.add(new int[] { i[0], i[1] });
            }
        }
        // Collections.sort (ans);
        return ans;
    }
}
