// Last updated: 10/16/2025, 10:42:15 AM
class Solution {
    public int[] decimalRepresentation(int n) {
        List<Integer> ans = new ArrayList<>();
        int power = 1;
        while (n > 0) {
            int t = n % 10;
            int val = t * power;
            if (val != 0)
                ans.add(val);
            power *= 10;
            n /= 10;
        }
        int m = 0;
        int res[] = new int[ans.size()];
        for (int i = ans.size() - 1; i >= 0; i--) {
            res[m++] = ans.get(i);
        }
        return res;
    }
}