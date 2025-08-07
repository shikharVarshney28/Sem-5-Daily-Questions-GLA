// Last updated: 8/7/2025, 2:52:40 PM
class Solution {
    public int fib(int n) {
       int a=0,b=1,sum=0;
       for(int i=0;i<n;i++)
       {
        a=b;
        b=sum;
        sum=a+b;
       } 
       return sum;
    }
}