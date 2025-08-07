// Last updated: 8/7/2025, 3:00:48 PM
class Solution {
    public int divide(int a, int b) {
        int max=Integer.MAX_VALUE,min=Integer.MIN_VALUE;
        if(a==b) return 1;
        else if(a==min && b<0) return max/-b;
        else return a/b;
    }
}