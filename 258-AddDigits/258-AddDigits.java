// Last updated: 8/7/2025, 2:56:54 PM
class Solution {
    public int addDigits(int num) {
        while(true)
        {
            int sum=0;
            if(num<10) return num;
            else{
                while(num!=0)
                {
                    sum=sum+num%10;
                    num/=10;
                }
            num=sum;
                }
        }
    }
}