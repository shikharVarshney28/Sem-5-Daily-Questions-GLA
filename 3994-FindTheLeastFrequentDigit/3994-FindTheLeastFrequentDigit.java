// Last updated: 9/3/2025, 10:45:15 AM
class Solution {
    public int getLeastFrequentDigit(int n) {
        long smallFreq = Long.MAX_VALUE;
        HashMap<Integer, Integer> hmap = new HashMap<>();
        while (n > 0) {
            int val = n % 10;
            hmap.put(val, hmap.getOrDefault(val, 0) + 1);
            n /= 10;
        }
        int ans = Integer.MAX_VALUE;
        for (int i : hmap.keySet()) {
            if (hmap.get(i) == smallFreq) {
                ans = Math.min(ans, i);
            }
            if(hmap.get(i)<smallFreq){
                smallFreq= hmap.get(i);
                ans = i;
            }
        }
        return ans;
    }
}