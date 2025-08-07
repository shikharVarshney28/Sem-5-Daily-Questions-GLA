// Last updated: 8/7/2025, 2:58:16 PM
class MinStack {
    Stack<Integer> Min=new Stack<>();
    Stack<Integer> st=new Stack<>();
    public MinStack() {
        
    }
    
    public void push(int val) {
        st.push(val);
        if(Min.size()==0    ||  Min.peek()>val) Min.push(val);
        else Min.push(Min.peek());
    }
    
    public void pop() {
        st.pop();
        Min.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return Min.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */