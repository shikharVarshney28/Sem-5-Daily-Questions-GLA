// Last updated: 8/7/2025, 2:55:42 PM
class Solution {
    public String addStrings(String num1, String num2) {
        String ans ="";
        int i=num1.length()-1,j=num2.length()-1,carry=0;
        while(i>=0 || j>=0){
            int sum=0;
            if(i>=0) sum+=num1.charAt(i--)-'0';
            if(j>=0) sum+=num2.charAt(j--)-'0';
            sum+=carry;
            carry = sum/10;
            sum%=10;
            ans= sum+ans;
        }
        if(carry!=0) ans = carry + ans;
        return ans;
    }
}