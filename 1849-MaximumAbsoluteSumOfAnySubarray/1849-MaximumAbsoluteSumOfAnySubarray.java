// Last updated: 8/7/2025, 2:49:29 PM
class Solution {
    public int maxAbsoluteSum(int[] nums) {
        // Kadamce Algo for max in subarray

        // find max in positive dir
        int currPos = 0, maxPos = Integer.MIN_VALUE;
        for (int i : nums) {
            currPos += i;
            maxPos = Math.max(maxPos, currPos);
            if (currPos < 0) {
                // maxPos = Math.max(maxPos, currPos);
                currPos = 0;
            }
        }
        maxPos = Math.max(maxPos, currPos);
        int currNeg = 0, maxNeg = Integer.MAX_VALUE;
        for (int i : nums) {
            currNeg += i;
            maxNeg = Math.min(currNeg, maxNeg);
            if (currNeg > 0) {
                // maxNeg = Math.min(currNeg, maxNeg);
                currNeg = 0;
            }
        }
        return Math.max(maxPos, (0 - Math.min(currNeg, maxNeg)));
    }
}