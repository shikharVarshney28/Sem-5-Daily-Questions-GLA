// Last updated: 8/7/2025, 2:46:48 PM
class Solution {
    public int[] closestPrimes(int left, int right) {
        boolean notPrime[] = new boolean[right + 1];
        notPrime[0] = notPrime[1] = true;
        for (int i = 2; i <= right; i++) {
            for (int j = 2; i * j <= right; j++) {
                notPrime[i * j] = true;
            }
        }
        //for(boolean i:notPrime) System.out.print(i+" ");
        int ans[] = new int[] { -1, -1 };
        int prevNum = -1, minDiff = Integer.MAX_VALUE;
        for (int i = left; i <= right; i++) {
            if (!notPrime[i]) {
                if (prevNum == -1) {
                    prevNum = i;
                } else {
                    if (minDiff > i - prevNum) {
                        ans[0] = prevNum;
                        ans[1] = i;
                        minDiff = i - prevNum;
                    }
                    prevNum = i;
                }
            }
        }
        return ans;
    }
}