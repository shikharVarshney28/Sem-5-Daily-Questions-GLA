// Last updated: 9/25/2025, 4:51:06 PM
class Router {
    Queue<String> qu;
    HashMap<String, int[]> hmap;
    int size;
    HashMap<Integer, List<Integer>> map;

    public Router(int memoryLimit) {
        hmap = new HashMap<>();
        qu = new LinkedList<>();
        size = memoryLimit;
        map = new HashMap<>();
    }

    public boolean addPacket(int source, int destination, int timestamp) {
        String key = source + "/" + destination + "/" + timestamp;
        if (hmap.containsKey(key))
            return false;
        if (qu.size() == size) {
            forwardPacket();
        }
        qu.add(key);
        hmap.put(key, new int[] { source, destination, timestamp });
        if (!map.containsKey(destination))
            map.put(destination, new ArrayList<>());
        map.get(destination).add(timestamp);
        return true;
    }

    public int[] forwardPacket() {
        if (qu.size() <= 0)
            return new int[] {};
        String s = qu.poll();
        int ans[] = hmap.get(s);
        hmap.remove(s);
        map.get(ans[1]).remove(map.get(ans[1]).indexOf(ans[2]));
        return ans;
    }

    public int getCount(int destination, int startTime, int endTime) {
        int end = find(destination, endTime, true);
        int st = find(destination, startTime, false);
        if (st > end || st < 0 || end < 0)
            return 0;
        return end - st + 1;
    }

    int find(int d, int t, boolean f) {
        List<Integer> arr = map.get(d);
        if (arr == null || arr.size() == 0)
            return f ? -1 : 0;
        int st = 0, end = arr.size() - 1;
        int ans = -1;
        while (st <= end) {
            int mid = (st + end) / 2;

            if (f) {
                // iss mid se just big
                if (arr.get(mid) <= t) {
                    ans = mid;
                    st = mid + 1;
                } else
                    end = mid - 1;
            } else {
                // isse just small
                if (arr.get(mid) >= t) {
                    ans = mid;
                    end = mid -1;
                } else
                    st = mid +1;
            }
        }
        //System.out.println(arr + " " + f + " " + ans);
        return ans;
    }
}
