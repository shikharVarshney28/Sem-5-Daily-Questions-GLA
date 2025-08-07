// Last updated: 8/7/2025, 2:43:29 PM
class Solution {
    boolean isPrime(long n){
        if(n == 1) return false;
        for(int i=2;i<=Math.pow (n,.5);i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public long sumOfLargestPrimes(String s) {
        PriorityQueue<Long>pq = new PriorityQueue <>(Collections.reverseOrder());
        for(int i=0;i<s.length ();i++){
            for(int j=i+1;j<=s.length();j++){
                long n = Long.parseLong(s.substring (i,j));
                if(!pq.contains(n) && isPrime(n)){
                    pq.add (n);
                }
            }
        }
        long sum=0;
        int count=0;
        while(!pq.isEmpty () && count<3){
            sum+=pq.poll ();
            count++;
        }
        return sum;
    }
}