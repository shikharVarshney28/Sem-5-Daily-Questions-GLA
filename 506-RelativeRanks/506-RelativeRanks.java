// Last updated: 8/7/2025, 2:55:04 PM
class Solution {
    public String[] findRelativeRanks(int[] score) {
        Integer pos[] = new Integer[score.length];
        for (int i = 0; i < score.length; i++)
            pos[i] = i;
        Arrays.sort(pos, new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {
                return score[(int) b] - score[(int) a];
            }
        });
        String[] ans = new String[score.length];
        for (int i = 0; i < score.length; i++) {
            if (i == 0)
                ans[pos[0]] = "Gold Medal";
            else if (i == 1)
                ans[pos[1]] = "Silver Medal";
            else if (i == 2)
                ans[pos[2]] = "Bronze Medal";
            else
                ans[pos[i]] = "" + (i + 1);
        }
        return ans;
    }
}