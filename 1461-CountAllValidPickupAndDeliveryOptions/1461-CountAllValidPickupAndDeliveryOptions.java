// Last updated: 8/7/2025, 2:51:13 PM
class Solution {
    public int countOrders(int n) {
        //Ways to pickUp = n!
        int mod =(int)Math.pow(10,9)+7;
        long pickUp=1;
        for(int i=2;i<=n;i++){
            pickUp=(pickUp*i)%mod;
        }
        //ways to delivery --->  1st box ,2 box ,3rd nox......----> 1*3*5*7*....*(2i-1) ways
        long delivery=1;
        for(int i=1;i<=n;i++){
            delivery = (delivery*(2*i -1))%mod;
        }
        return (int)((delivery)*(pickUp)%mod);
    }
}