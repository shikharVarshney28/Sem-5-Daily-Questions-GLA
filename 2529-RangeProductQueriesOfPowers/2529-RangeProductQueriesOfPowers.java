// Last updated: 8/20/2025, 10:57:11 AM
class Solution {
    long mod = (long) Math.pow(10, 9) + 7;

    List<Integer> find(int n) {
        List<Integer> ans = new ArrayList<>();
        while (n > 0) {
            int len = Integer.toBinaryString(n).length();
            ans.add((int) Math.pow(2, len - 1));
            n -= Math.pow(2, len - 1);
        }
        Collections.sort(ans);
        return ans;
    }

    public int[] productQueries(int n, int[][] queries) {
        if (n > 0 && (n & (n - 1)) == 0) {
            int ans[] = new int[queries.length];
            Arrays.fill(ans, n);
            return ans;
        }
        List<Integer> powers = find(n);
        int prefixMul[] = new int[powers.size()];
        prefixMul[0] = powers.get(0);

        int ans[] = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int left = queries[i][0], right = queries[i][1];
            long pro = 1;
            for (int j = left; j <= right; j++) {
                pro = (pro * powers.get(j)) % mod;
            }
            ans[i] = (int) pro;
        }
        return ans;
    }
}