// Last updated: 8/7/2025, 2:53:21 PM
class MyCircularDeque {
     Deque<Integer> dq;
        int size;
    public MyCircularDeque(int k) {
        dq=new ArrayDeque<>();
        size=k;
    }
    
    public boolean insertFront(int value) {
        if(dq.size()==size) return false;
            dq.addFirst(value);
            return true;
    }
    
    public boolean insertLast(int value) {
        if(dq.size()==size) return false;
            dq.addLast(value);
            return true;
    }
    
    public boolean deleteFront() {
        if(dq.size()!=0){
                dq.removeFirst();
                return true;
            }
            return false;
    }
    
    public boolean deleteLast() {
        if(dq.size()!=0){
                dq.removeLast();
                return true;
            }
            return false;
    }
    
     public int getFront(){
            return dq.isEmpty() ? -1 : dq.peekFirst();
        }
    public int getRear(){
            return dq.isEmpty() ? -1 : dq.peekLast();
        }
    public boolean isEmpty(){
            return dq.isEmpty();
        }
    public boolean isFull(){
            return dq.size()==size;
        }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */