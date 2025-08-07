// Last updated: 8/7/2025, 2:46:05 PM
class Solution {
    boolean isValid(int cmp, int s, int idx, int currSum) {
        if (s == 0)
            return currSum == cmp;
        boolean formed = false;
        for (int i = 1; i <= ("" + s).length(); i++) {
            formed = formed || isValid(cmp, (int) (s / Math.pow(10, i)), idx, currSum + (int) (s % Math.pow(10, i)));
        }

        return formed;

    }

    public int punishmentNumber(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            int num = i * i;
            if (isValid(i, num, 0, 0)) {
                //System.out.println(num);
                count += num;
            }
        }
        return count;
    }
}