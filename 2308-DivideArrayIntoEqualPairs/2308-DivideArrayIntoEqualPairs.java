// Last updated: 8/7/2025, 2:47:59 PM
class Solution {
    public boolean divideArray(int[] nums) {
        int freq[] = new int[501];
        for (int num : nums) {
            freq[num]++;
        }
        for (int i : freq) {
            if (i % 2 != 0){
                return false;
            }
        }
        return true;
    }
}