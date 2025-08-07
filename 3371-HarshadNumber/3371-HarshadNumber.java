// Last updated: 8/7/2025, 2:45:10 PM
class Solution {
    int sum(int x)
    {
        if(x<10) return x;
        return (x%10)+sum(x/10);
    }
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int s=sum(x);
        if(x%s==0) return s;
        return -1;
    }
}