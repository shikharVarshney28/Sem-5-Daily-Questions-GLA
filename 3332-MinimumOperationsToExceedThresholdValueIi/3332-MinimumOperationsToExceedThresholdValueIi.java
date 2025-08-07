// Last updated: 8/7/2025, 2:45:15 PM
class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> pq=new PriorityQueue <>();
        int ans=0;
        for(int i:nums) pq.add ((long)i);
        while(pq.size()>=2){
            if(pq.peek () >= k) return ans;
            long x=pq.poll (), y=pq.poll ();
            pq.add (Math.min(x,y)*2 + Math.max (x,y));
           // System.out.println (pq);
            ans++;
        }
        return ans;
    }
}