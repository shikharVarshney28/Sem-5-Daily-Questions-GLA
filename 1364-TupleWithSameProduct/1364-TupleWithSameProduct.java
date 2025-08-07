// Last updated: 8/7/2025, 2:51:39 PM
class Solution {
    public int tupleSameProduct(int[] nums) {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        int n = nums.length;
        // Create groups of tuple(a,b) anand store the answer of their product as key of
        // hmap and count the tuples who give same resukt as the ques demans
        // (a*b)=(c*b)....
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                hmap.put(nums[i] * nums[j], hmap.getOrDefault(nums[i] * nums[j], 0) + 1);
            }
        }
        int ans = 0;
        // now we know that the product of (a,b) and (c,d) will be in same group so now
        // just ne find the combinations only
        // 1 tuple of (a,b,c,d) gives permutations of 4 and if we have tuples>2 so total
        // permutations of (a,b) -> 4 * (count -1).....so for all ttuples will give net
        // answer -> 4*(count-1)*count...
        for (int i : hmap.keySet()) {
            int count = hmap.get(i);
            ans += (4 * (count - 1) * count);
        }
        return ans;
    }
}