// Last updated: 8/7/2025, 2:46:27 PM
class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue <Integer> pq=new PriorityQueue <>(Collections.reverseOrder ());
        for(int i:gifts) pq.add (i);
        long ans=0;
        while(k-->0){
            pq.add((int)Math.floor(Math.sqrt(pq.poll())));
        }
        while(!pq.isEmpty ()) ans+=pq.poll ();
        return ans;
    }
}