// Last updated: 10/16/2025, 10:43:13 AM
class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        int size = 0, prev = -1001, st = 0, n = nums.size();
        for (int i = 0; i < n; i++) {
            if (i + k >= n) // no more subarray of size k is valid afterwards...
                return false;
            if (nums.get(i) > prev) {
                prev = nums.get(i);
                size++;
                if (size == k) {
                    boolean val = possible(nums, i + 1, k);
                    if (val)
                        return true;
                    st++;
                    size--;
                }
            } else {
                st = i; // beacuse the i is pointing to that very index that has viloted the cond of numms[i] < nums[i+1] so any subbray including this index will not be counted so we discard all subarrays including this indx and shif st to this idx bacuse it can create the subbbray afterwars...
                size = 1;
                prev = nums.get(i); // since i & st is at i so the prev will need to be updated if the statring idx i.e 0 & 1 violtes the condition... 
            }
        }
        return false;
    }

    boolean possible(List<Integer> nums, int idx, int k) {
        for (int i = idx; i < idx + k - 1; i++) {
            if (nums.get(i) >= nums.get(i + 1)) // vilotes the condtion of strictly inc
                return false;
        }
        return true;
    }
}