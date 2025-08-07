// Last updated: 8/7/2025, 2:55:59 PM
class Solution {
    List<Integer> l = new ArrayList<>();

    void formNumber(int n, int s) {
        if (s <= n) {
            l.add(s);
        }
        if (s > n)
            return;
        for (int i = 0; i <= 9; i++) {
            formNumber(n, s * 10 + i);
        }
    }

    public List<Integer> lexicalOrder(int n) {
        for (int i = 1; i <= 9; i++)
            formNumber(n, i);
        return l;
    }
}