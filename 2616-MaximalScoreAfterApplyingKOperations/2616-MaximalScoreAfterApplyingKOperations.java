// Last updated: 8/7/2025, 2:46:45 PM
class Solution {
    public long maxKelements(int[] nums, int k) {
        PriorityQueue<Long> pq=new PriorityQueue<>(Collections.reverseOrder());
        long score=0;
        for(int i:nums) pq.add((long)i);
        while(k-->0){
            long x=pq.poll();
            score+=x;
            pq.add((long)Math.ceil(x/3.0));
        }
        return score;

    }
}