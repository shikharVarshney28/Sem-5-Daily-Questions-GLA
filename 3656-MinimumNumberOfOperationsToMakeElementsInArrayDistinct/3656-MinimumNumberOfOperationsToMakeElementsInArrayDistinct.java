// Last updated: 8/7/2025, 2:44:01 PM
class Solution {
    boolean isAllDistinct(int arr[]) {
        for (int i : arr) {
            if (i > 1)
                return false;
        }
        return true;
    }

    public int minimumOperations(int[] nums) {
        int freq[] = new int[101];
        for (int i : nums) {
            freq[i]++;
        }
        int i = 0, opr = 0;
        while (i < nums.length) {
            if (isAllDistinct(freq))
                return opr;
            else {
                freq[nums[i]]--;
                if (i + 1 < nums.length) {
                    freq[nums[i + 1]]--;
                }
                if (i + 2 < nums.length) {
                    freq[nums[i + 2]]--;
                }
                opr++;
                i += 3;
            }
        }
        return opr;
    }
}
