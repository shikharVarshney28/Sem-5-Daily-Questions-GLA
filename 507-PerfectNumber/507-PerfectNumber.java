// Last updated: 8/7/2025, 2:55:03 PM
class Solution {
    public boolean checkPerfectNumber(int num) {
        int sum=0;
        for(int i=1;i<=num/2;i++)
        {
            if(num%i==0) sum+=i;
        }
        return num==sum;
    }
}