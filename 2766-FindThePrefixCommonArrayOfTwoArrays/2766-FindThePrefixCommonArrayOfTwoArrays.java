// Last updated: 8/7/2025, 2:46:11 PM
class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        int m = A.length;
        int[] res = new int[m];
        res[0] = A[0] == B[0] ? 1 : 0;
        a.add(A[0]);
        b.add(B[0]);
        for (int i = 1; i < m; i++) {
            int count = 0;
            if (A[i] == B[i]){
                count++;
                res[i]=res[i-1]+1;
                continue;
            }
            if (a.contains(B[i])) {
                count++;
            } else
                b.add(B[i]);
            if (b.contains(A[i]))
                count++;
            else
                a.add(A[i]);
            res[i] = res[i - 1] + count;
        }
        return res;
    }
}