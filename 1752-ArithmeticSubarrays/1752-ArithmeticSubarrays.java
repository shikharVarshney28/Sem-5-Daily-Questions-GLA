// Last updated: 8/7/2025, 2:49:51 PM
class Solution {
    boolean find(List<Integer> l) {
        int diff = l.get(1) - l.get(0);
        for (int i = 1; i < l.size() - 1; i++) {
            if (diff != l.get(i + 1) - l.get(i))
                return false;
        }
        return true;
    }

    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> res = new ArrayList<>();
        for (int i = 0; i < l.length; i++) {
            List<Integer> ans = new ArrayList<>();
            for (int j = l[i]; j <= r[i]; j++)
                ans.add(nums[j]);
            Collections.sort(ans);
            res.add(find(ans));
        }
        return res;
    }
}