// Last updated: 8/7/2025, 2:46:44 PM
class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
        Arrays.sort(score,new Comparator<int[]>(){
            public int compare(int[] a,int[] b)
            {
                return b[k]-a[k];
            }
        });
        return score;
    }
}