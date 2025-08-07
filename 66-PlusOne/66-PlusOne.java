// Last updated: 8/7/2025, 2:59:59 PM
class Solution {
    public int[] plusOne(int[] digits) {
        
        int [] ans=new int[digits.length+1];
        int carry=1;
        for(int i=digits.length-1;i>=0;i--){
            int sum=digits[i]+carry;
            carry=sum/10;
            sum%=10;
            digits[i]=sum;
        }
        if(carry!=0){
            ans[0]=carry;
            for(int i=1;i<digits.length+1;i++) ans[i]=digits[i-1];
        }

        return carry!=0?ans:digits;
    }
}