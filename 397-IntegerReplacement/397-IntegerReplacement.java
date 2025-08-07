// Last updated: 8/7/2025, 2:55:52 PM
class Solution {
    int find(long n){
        if(n<1) return Integer.MAX_VALUE;
        if(n==1) return 0;
        if(n%2==0){
            return find(n/2)+1;
        }
        return Math.min(find(n+1),find(n -1))+1;
    }
    public int integerReplacement(int n) {
        return find(n);
    }
}