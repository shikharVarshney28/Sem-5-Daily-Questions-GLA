// Last updated: 8/7/2025, 2:47:37 PM
class NumberContainers {
    HashMap<Integer,PriorityQueue<Integer>> hmap;
    HashMap<Integer,Integer> used=new HashMap<>();
    public NumberContainers() {
        hmap=new HashMap<>();
        used=new HashMap <>();
    }
    
    public void change(int index, int number) {
        PriorityQueue <Integer> pq;
        if(used.containsKey(index)){
            //replacement
            int val=used.get(index);
            if(val==number) return;
            pq=hmap.get (val);
            pq.remove(index);
            hmap.put (val,pq);
        }
        used.put(index,number);
        
        if(hmap.containsKey (number)){
            pq=hmap.get (number);
        }else{
            pq=new PriorityQueue <>();
        }
        pq.add (index);
        hmap.put (number,pq);
        
    }
    
    public int find(int number) {
        if(!hmap.containsKey (number) || hmap.get(number).size()==0) return -1;
        return hmap.get(number).peek();
    }
}

/**
 * Your NumberContainers object will be instantiated and called as such:
 * NumberContainers obj = new NumberContainers();
 * obj.change(index,number);
 * int param_2 = obj.find(number);
 */