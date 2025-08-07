// Last updated: 8/7/2025, 2:42:56 PM
class Solution {
    long findSum(int n){
        long sum=0;
        while(n>0){
            sum+= n%10;
            n/=10;
        }
        return sum;
    }
    public boolean checkDivisibility(int n) {
        long sum = findSum(n);
        long prod=1;
        int x = n;
        while(x>0){
            prod*=x%10;
            if(prod==0) return n%sum==0;
            if(prod>n) return false;
            if(prod == n && x>1) return false;
            x/=10;
        }
        return n%(sum + prod) == 0;
    }
}