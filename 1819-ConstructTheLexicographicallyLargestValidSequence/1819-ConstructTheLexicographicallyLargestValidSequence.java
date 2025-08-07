// Last updated: 8/7/2025, 2:49:35 PM
class Solution {
    List<Integer> used = new ArrayList<>();
    boolean formed = false;

    int[] form(int ans[], int idx, List<Integer> ll) {
        if (idx >= ans.length) {
            formed = true;
            return ans;
        }
        if (ans[idx] != 0) {
            return form(ans, idx + 1, ll);
        } else {
            for (int i = 0; i < ll.size(); i++) {
                if (used.contains(i))
                    continue;
                int ele = ll.get(i);
                if (ele != 1 && (idx + ele) >= ans.length)
                    return new int[] { -1 };
                if (ele != 1 && ans[idx + ele] != 0)
                    continue;
                if (ele == 1)
                    ans[idx] = 1;
                else
                    ans[idx] = ans[idx + ele] = ele;
                used.add(i);
                int res[] = form(ans, idx + 1, ll);
                if (formed)
                    return res;
                // back trackking
                used.remove(used.size() - 1);
                if (ele == 1)
                    ans[idx] = 0;
                else
                    ans[idx + ele] = ans[idx] = 0;
                // i=0;

            }
        }
        return ans;
    }

    public int[] constructDistancedSequence(int n) {
        List<Integer> ll = new ArrayList<>();
        for (int i = n; i > 0; i--)
            ll.add(i);
        int ans[] = new int[2 * n - 1];
        return form(ans, 0, ll);
    }
}