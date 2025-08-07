// Last updated: 8/7/2025, 2:47:34 PM
class Solution {
    public long countBadPairs(int[] nums) {
        // bad Pairs j-i=nums[j]-nums[i]
        // so good Pairs = j - i==nums[j]-nums[i] on rearranging we get j-nums[j] ==
        // i-nums[i] so net ans is totalPairs - goodPairs
        long goodPair = 0;
        long n = nums.length;
        long totalPair = n * (n - 1) / 2;
        HashMap<Integer, Integer> hmap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int val = i - nums[i];
            int prevVal = hmap.getOrDefault(val, 0);
            goodPair += prevVal;
            hmap.put(val, prevVal + 1);
        }
        return totalPair - goodPair;
    }
}