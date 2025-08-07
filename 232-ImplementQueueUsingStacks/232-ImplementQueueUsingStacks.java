// Last updated: 8/7/2025, 2:57:16 PM
class MyQueue {
    Stack <Integer> st=new Stack<>();
    Stack <Integer> gt=new Stack<>();
    public MyQueue() {
        
    }
    
    public void push(int x) {
        st.push(x);
    }
    
    public int pop() {
        while(st.size()!=0) gt.push(st.pop());
        int x=gt.pop();
        while(gt.size()!=0) st.push(gt.pop());
        return x;
    }
    
    public int peek() {
        while(st.size()!=0) gt.push(st.pop());
        int x=gt.peek();
        while(gt.size()!=0) st.push(gt.pop());
        return x;
    }
    
    public boolean empty() {
        return st.size()==0;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */