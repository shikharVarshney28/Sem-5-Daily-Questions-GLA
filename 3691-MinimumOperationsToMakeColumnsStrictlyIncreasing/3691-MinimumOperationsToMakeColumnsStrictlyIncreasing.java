// Last updated: 8/7/2025, 2:43:56 PM
class Solution {
    public int minimumOperations(int[][] grid) {
        int operation = 0;
        for (int col = 0; col < grid[0].length; col++) {
            int start = grid[0][col] + 1;
            for (int row = 1; row < grid.length; row++) {
                if (grid[row][col] > grid[row - 1][col]) {
                    start = grid[row][col] +1;
                    continue;
                }
                operation += (-grid[row][col] + start);
                grid[row][col] = start++;
                 //System.out.println (row +" "+col+" "+start+" "+operation);
            }
        }
        return operation;
    }
}