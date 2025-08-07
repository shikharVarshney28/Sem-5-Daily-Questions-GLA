// Last updated: 8/7/2025, 2:53:39 PM
class KthLargest {
    PriorityQueue<Integer>h;
    int k;
    public KthLargest(int k, int[] nums) {
        h=new PriorityQueue<>();
        this.k=k;
        for(int i:nums) add(i);
    }
    
    public int add(int val) {
        if(h.size()<k||h.peek()<val){
            h.add(val);
            if(h.size()>k) h.remove();
        }
        return h.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */