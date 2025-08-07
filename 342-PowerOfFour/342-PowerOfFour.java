// Last updated: 8/7/2025, 2:56:16 PM
class Solution {
    public boolean isPowerOfFour(int n) {
        long p=0,i=0;
        while(p<n)
        {
            p=(long)Math.pow(4,i++);
            if(p==n) return true;
        }
        return false;
    }
}