// Last updated: 8/7/2025, 2:42:58 PM
class Solution {
    boolean prime[] = new boolean[100001];

    void primeSieve() {
        Arrays.fill(prime, true);
        prime[0] = prime[1] = false;
        for (int i = 2; i <= Math.pow(100001, 0.5); i++) {
            if (!prime[i])
                continue;
            for (int j = 2; i * j < 100001; j++) {
                prime[i * j] = false;
            }
        }
    }

    public long splitArray(int[] nums) {
        primeSieve();
        /*for(int i=0;i<prime.length;i++){
            if(prime[i]) System.out.print(i+" ");
        }*/
        long ls = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (prime[i]) {
                ls -= nums[i];
            }else ls+=nums[i];
        }
        return Math.abs(ls);
    }
}