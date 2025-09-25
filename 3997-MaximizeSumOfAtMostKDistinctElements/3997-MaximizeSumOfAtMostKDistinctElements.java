// Last updated: 9/25/2025, 4:50:46 PM
class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
        Arrays.sort(nums);

        HashSet<Integer> hSet = new LinkedHashSet<>();
        int idx = 0, i = nums.length - 1;
        while (k > 0 && i >= 0) {
            int n = nums[i--];
            if (!hSet.contains(n)) {
                k--;
                hSet.add(n);
            }
        }
        int ans[] = new int[hSet.size()];
        for (int j : hSet)
            ans[idx++] = j;

        return ans;
    }
}