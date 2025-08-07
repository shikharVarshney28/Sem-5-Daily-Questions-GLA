// Last updated: 8/7/2025, 2:43:18 PM
class Solution {
    long product(int end, int st, boolean cycle) {
        List<Long> l = new ArrayList<>(); // tonplace the numbers so that pro can be increased
        //System.out.println (st+" "+end);
        long i = st;
        while (i <= end) {
            l.add((long) i);
            i += 2;
        }
        //System.out.println (l);
        i = l.get(l.size() - 1);
        if (i == end)
            i = end - 1;
        else
            i = end;
        while (i >= st) {
            l.add(i);
            i -= 2;
        }
        long ans = 0;
        //System.out.println (l);
        for (int j = 0; j < (end - st); j++) {
            ans += (l.get(j) * l.get(j + 1));
        }
        if (cycle)
            return ans + l.get(0) * l.get(l.size() - 1);
        return ans;
    }

    long pro(PriorityQueue<int[]> pq, int n) {
        long ans = 0;
        while (!pq.isEmpty()) {
            int arr[] = pq.poll();
            if (arr[0] == 1) {
                ans += product(n, n - arr[1] + 1, true);
            } else
                ans += product(n, n - arr[1] + 1, false);
            n -= arr[1];
        }
        return ans;
    }

    int[] find(List<List<Integer>> adjList, boolean vis[], int src) {
        //finding the cycles
        Queue<int[]> qu = new LinkedList<>();
        qu.add(new int[] { src, -1 });
        int nodes = 1;
        while (!qu.isEmpty()) {
            int t[] = qu.poll();
            for (int i : adjList.get(t[0])) {
                if (i == t[1])
                    continue;
                if (vis[i])
                    return new int[] { 1, nodes };
                vis[i] = true;
                qu.add(new int[] { i, t[0] });
                nodes++;
            }
        }
        return new int[] { -1, nodes };
    }

    public long maxScore(int n, int[][] edges) {
        List<List<Integer>> adjList = new ArrayList<>();
        PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>() {
            public int compare(int a[], int b[]) {
                if (a[0] == b[0])
                    return b[1] - a[1];
                return b[0] - a[0];
            }
        });
        for (int i = 0; i < n; i++)
            adjList.add(new ArrayList<>());
        for (int i[] : edges) {
            adjList.get(i[0]).add(i[1]);
            adjList.get(i[1]).add(i[0]);
        }
        boolean vis[] = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (vis[i])
                continue;
            vis[i] = true;
            int arr[] = find(adjList, vis, i);
            pq.add(arr);
            // System.out.println (i+" "+arr[0]+" "+arr[1]);

        }
        //System.out.println (pq.peek()[0]+" "+pq.peek()[1]);
        return pro(pq, n);
        //return 120;
    }
}