// Last updated: 8/7/2025, 2:50:11 PM
class Solution {
    boolean isPossible(int arr[], int mid, int balls) {
        int prevAllocation = 0;
        balls--;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - arr[prevAllocation] >= mid) {
                prevAllocation = i;
                balls--;
            }
            if (balls == 0)
                return true;
        }
        return balls == 0;
    }

    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int st = 1, end = position[position.length - 1] - st;
        int ans = -1;
        while (st <= end) {
            int mid = end - (end - st) / 2;
            if (isPossible(position, mid, m)) {
                System.out.println(mid);
                ans = mid;
                st = mid + 1;
            } else
                end = mid - 1;
        }
        return ans;
    }
}