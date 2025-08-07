// Last updated: 8/7/2025, 2:43:01 PM
class Solution {
    boolean  prime[]=new boolean [101];
    void primeSieve(){
        Arrays.fill(prime,true);
        prime[0]=false;
        prime[1]=false;
        for(int i=2;i<101;i++){
            if(!prime[i]) continue;
            for(int j=2;j*i<101;j++){
                prime[i*j]=false;
            }
        }
    }
    public boolean checkPrimeFrequency(int[] nums) {
        primeSieve();
        int freq[]=new int[101];
        for(int i:nums){
            freq[i]++;
        }
        for(int i:freq){
            if(prime[i]) return true;
        }
        return false;
    }
}