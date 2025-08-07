// Last updated: 8/7/2025, 2:57:17 PM
class Solution {
    public boolean isPowerOfTwo(int n) {
        long f=0,i=0;
        while(f<n)
        {
            f=(long)Math.pow(2,i);
            if(f==n) return true;
            i++;
        }
        return false;
    }
}