// Last updated: 8/7/2025, 2:59:58 PM
class Solution {
    public String addBinary(String a, String b) {
        String ans="";
        int carry=0,i=a.length()-1,j=b.length()-1;
        while(true)
        {
            int x=0,y=0;
            if(i>-1) x=a.charAt(i)-'0';
            if(j>-1) y=b.charAt(j)-'0';
            int sum=0;
            if(i!=-1) sum+=x;
            if(j!=-1) sum+=y;
            sum+=carry;
            carry=sum/2;
            sum%=2;
            ans=""+sum+ans;
            if(i<0 && j<0) break;
            i--;j--;
        }
        if(carry==1)  ans=""+carry+ans;
        if(ans.charAt(0)=='0') return ans.substring(1);
        return ans;
    }
}