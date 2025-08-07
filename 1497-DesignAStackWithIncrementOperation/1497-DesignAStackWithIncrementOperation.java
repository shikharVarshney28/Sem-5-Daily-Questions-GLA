// Last updated: 8/7/2025, 2:50:57 PM
class CustomStack {
    int arr[];
    int idx;
    int size;
    int capacity;
    public CustomStack(int maxSize) {
        arr=new int[maxSize];
        idx=-1;
        size=0;
        capacity=maxSize;
    }
    
    public void push(int x) {
        if(size==capacity) return ;
        arr[++idx]=x;
        size++;

    }
    
    public int pop() {
        if(size==0) return -1;
        int val=arr[idx];
        idx--;
        size--;
        return val;
    }
    
    public void increment(int k, int val) {
        int min=Math.min(size,k);
        for(int i=0;i<min;i++) arr[i]+=val;
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */