// Last updated: 8/7/2025, 2:43:14 PM
class Solution {
    public int maxProduct(int n) {
        int max=-1,max2=-1;
        while(n>0){
            int num = n%10;
            if(num>max){
                max2=max;
                max=num;
            }else if(num>max2){
                max2=num;
            }
            n/=10;
        }
        return max*max2;
    }
}