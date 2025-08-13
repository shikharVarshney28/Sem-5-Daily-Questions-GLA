// Last updated: 8/13/2025, 10:48:34 AM
class Solution {
    public long maxTotal(int[] value, int[] limit) {
        HashMap<Integer,PriorityQueue<Integer>> hmap= new HashMap<>();
        for(int i=0;i<value.length;i++){
            PriorityQueue <Integer> pq;
            if(hmap.containsKey (limit[i])) pq = hmap.get (limit[i]);
            else pq = new PriorityQueue<>(Collections.reverseOrder());
            pq.add(value[i]);
            hmap.put(limit[i],pq);
        }
        //System.out.println(hmap);
        long sum =0;
        for(int i : hmap.keySet()){
            int size = i;
            PriorityQueue <Integer> pq = hmap.get(i);
            while(size-->0 && pq.size()>0) sum+= pq.poll();
        }
        return sum;
    }
}