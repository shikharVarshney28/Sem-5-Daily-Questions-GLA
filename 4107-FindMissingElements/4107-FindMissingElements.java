// Last updated: 11/19/2025, 12:33:09 PM
class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min = Arrays.stream(nums).min().getAsInt();
        int max = Arrays.stream(nums).max().getAsInt();
        HashSet<Integer> hset = new HashSet<>();
        for (int i = 0; i < nums.length; i++)
            hset.add(nums[i]);
        List<Integer> ll = new ArrayList<>();
        for (int i = min + 1; i < max; i++) {
            if (!hset.contains(i))
                ll.add(i);
        }
        return ll;
    }
}