// Last updated: 8/7/2025, 2:49:36 PM
class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int i = 0, st = 0;
        int sum = 0;
        HashSet<Integer> hset = new HashSet<>();
        int ans = -1;
        while (i < nums.length) {
            if (!hset.contains(nums[i])) {
                sum += nums[i];
                hset.add(nums[i++]);

            } else {

                ans = Math.max(ans, sum);
                //now search in subarray form st to i-1 where ith ele is repeated
                while (st < i && nums[i] != nums[st]) {
                    sum -= nums[st];
                    hset.remove(nums[st++]);
                }
                //remove the curr st ele since removed so make st++;
                sum -= nums[st];
                hset.remove(nums[st++]);

                // now add ith ele even if i==st
                sum += nums[i]; // st == i
                hset.add(nums[i++]); // st == i

            }

        }
        return Math.max(ans, sum);
    }
}