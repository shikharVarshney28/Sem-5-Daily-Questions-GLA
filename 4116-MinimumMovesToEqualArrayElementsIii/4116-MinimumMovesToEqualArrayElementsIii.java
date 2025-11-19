// Last updated: 11/19/2025, 12:33:12 PM
class Solution {
    public int minMoves(int[] nums) {
        int max = Arrays.stream(nums).max().getAsInt ();
        int moves =0;
        for(int i:nums) moves += (max - i);
        return moves;
    }
}