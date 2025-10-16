// Last updated: 10/16/2025, 10:45:44 AM
class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
        int ans[] = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            ans[i] = find(nums, queries[i]);
        }
        return ans;
    }

    int find(int[] arr, int target) {
        int st = 0, i = 0, ans = 0, cs = 0;
        for (; i < arr.length; i++) {
            cs += arr[i];
            while (cs > target) {
                ans = Math.max(ans, i - st);
                cs -= arr[st++];
            }
        }
        return Math.max(ans, i - st);
    }
}