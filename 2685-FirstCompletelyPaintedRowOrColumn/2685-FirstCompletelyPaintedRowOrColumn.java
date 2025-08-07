// Last updated: 8/7/2025, 2:46:33 PM
class Solution {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        HashMap<Integer, int[]> hmap = new HashMap<>();
        int m = mat.length, n = mat[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                hmap.put(mat[i][j], new int[] { i, j });
            }
        }
        int row[] = new int[m];
        int col[] = new int[n];
        for (int i =0;i<m*n;i++) {
            int temp[] = hmap.get(arr[i]);
            row[temp[0]]++;
            col[temp[1]]++;
            if (row[temp[0]] == n || col[temp[1]] == m)
                return i;
        }
        return -1;
    }
}