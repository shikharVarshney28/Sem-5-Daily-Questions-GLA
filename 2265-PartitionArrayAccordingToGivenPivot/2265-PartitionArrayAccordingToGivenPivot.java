// Last updated: 8/7/2025, 2:48:08 PM
class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        List<Integer> smaller = new ArrayList<>();
        List<Integer> larger = new ArrayList<>();
        int count = 0;
        for (int i : nums) {
            if (i == pivot)
                count++;
            else if (i < pivot)
                smaller.add(i);
            else
                larger.add(i);
        }

        int idx = 0;
        for (int i : smaller)
            nums[idx++] = i;
        for (int i = 0; i < count; i++)
            nums[idx++] = pivot;
        for (int i : larger)
            nums[idx++] = i;
        return nums;
    }
}