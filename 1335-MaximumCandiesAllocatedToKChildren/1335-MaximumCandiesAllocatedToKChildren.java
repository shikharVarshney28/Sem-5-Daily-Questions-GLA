// Last updated: 8/7/2025, 2:51:43 PM
class Solution {
    public int maximumCandies(int[] candies, long k) {
        int ans = 0, max = 0;
        long sum = 0;
        /*for (int i : candies) {
            max = Math.max(max, i);
            sum += i;
        }
        if (sum < k)
            return 0;*/
        int st = 1, end = (int)Math.pow(10,7);
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (isPossible(candies, k, mid)) {
                ans = mid;
                // inc the range
                st = mid + 1;
            } else
                end = mid - 1;
        }
        return ans;
    }

    boolean isPossible(int[] arr, long k, int mid) {
        long count = 0;
        for (int i = 0; i < arr.length; i++) {
            count += (arr[i] / mid);
            if (count >= k) {
                return true;
            }
        }
        return false;  
    }
}