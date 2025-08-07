// Last updated: 8/7/2025, 2:57:34 PM
class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        // This is just to reduce incoming edes one by one and if for any node edges =0 the course can be takne if no edges is zero and we cannot fill the answer array returj empty one
        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            adjList.add(new ArrayList<>());
        }
        int incoming[] = new int[numCourses];
        for (int i[] : prerequisites) {
            adjList.get(i[1]).add(i[0]);
            incoming[i[0]]++;
        }
        Queue<Integer> pq = new LinkedList<>(); //[incoming , course]
        for (int i = 0; i < numCourses; i++) {
            if (incoming[i] == 0) {
                pq.add(i);
            }
        }
        //if(pq.isEmpty ()) return new int[]{};
        int ans[] = new int[numCourses];
        int idx = 0;
        while (!pq.isEmpty()) {
            int t = pq.poll();
            ans[idx++] = t;
            for (int i : adjList.get(t)) {
                incoming[i]--;
                if (incoming[i] == 0) {
                    pq.add(i);
                }
            }
        }
        if (idx != numCourses)
            return new int[] {};
        //List<Integer> ans=new ArrayList <>();
        return ans;
    }
}
