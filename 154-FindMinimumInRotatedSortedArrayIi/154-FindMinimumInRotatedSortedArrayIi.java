// Last updated: 8/7/2025, 2:58:17 PM
class Solution {
    public int findMin(int[] nums) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i:nums){
            if(!pq.contains(i)) pq.add(i);
        }
        return pq.poll();
    }
}