// Last updated: 8/7/2025, 2:57:22 PM
class MyStack {
    Queue <Integer> qu=new LinkedList<>();
    public MyStack() {
        
    }
    
    public void push(int x) {
        if(qu.size()==0)
            qu.add(x);
        else
        {
            qu.add(x);
            for(int i=1;i<qu.size();i++)
                qu.add(qu.remove());
        }
    }
    
    public int pop() {
       
        return qu.remove();
    }
    
    public int top() {
        
        return qu.peek();
    }
    
    public boolean empty() {
        return qu.size()==0;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */