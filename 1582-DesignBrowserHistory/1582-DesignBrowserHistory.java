// Last updated: 8/7/2025, 2:50:30 PM
class BrowserHistory {
    Stack<String> history;
    Stack<String> st;
    
    public BrowserHistory(String homepage) {
        st = new Stack <>();
        history = new Stack <>();
        history.push(homepage);
    }
    
    public void visit(String url) {
        st=new Stack<>();
        history. push(url);
    }
    
    public String back(int steps) {
        while(history.size()>1 && steps-->0){
            st.push(history.pop());
        }
        return history.size()>0 ? history.peek() : "";
    }
    
    public String forward(int steps) {
        while(st.size ()>0 && steps-->0){
            history.push(st.pop());
        }
        return history.peek();
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */