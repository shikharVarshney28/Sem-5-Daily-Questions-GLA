// Last updated: 8/7/2025, 2:56:26 PM
class Solution {
    public boolean isPowerOfThree(int n) {
        long f=0,i=0;
        while(f<n)
        {
            f=(long)Math.pow(3,i++);
            if(f==n) return true;
        }
        return false;
    }
}