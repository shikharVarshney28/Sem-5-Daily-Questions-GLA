// Last updated: 8/7/2025, 2:47:49 PM
class Solution {
    public long maximumImportance(int n, int[][] roads) {
        long ans = 0;
        long degree[] = new long[n];
        for (int i[] : roads) {
            degree[i[0]]++;
            degree[i[1]]++;
        }
        Arrays.sort(degree);
        long lable = 1;
        for (long i : degree) {
            ans += (i * lable++);
        }
        return ans;
    }
}