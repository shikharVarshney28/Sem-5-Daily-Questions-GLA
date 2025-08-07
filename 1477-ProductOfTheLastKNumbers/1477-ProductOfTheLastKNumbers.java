// Last updated: 8/7/2025, 2:51:05 PM
class ProductOfNumbers {
    ArrayList <Integer> ans;
    public ProductOfNumbers() {
        ans=new ArrayList<>();
    }
    
    public void add(int num) {
        ans.add (num);
    }
    
    public int getProduct(int k) {
        int pro=1;
        for(int i=ans.size ()-1 ;i>=ans.size () - k;i--){
            pro*=ans.get (i);
            if(pro == 0) return 0;
        }
        return pro;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */