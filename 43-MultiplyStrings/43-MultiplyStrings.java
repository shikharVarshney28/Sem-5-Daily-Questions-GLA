// Last updated: 8/7/2025, 3:00:32 PM
class Solution {
    public String multiply(String s1, String s2) {
        int arr[]=new int[s1.length()+s2.length()];
        for(int i=s2.length()-1;i>=0;i--)
        {
            int prevCarry=0,prevSum=0,idx=(s2.length()-1)-i;
            for(int j=s1.length()-1;j>=0;j--)
            {
                int num= ((s1.charAt(j)-'0')*(s2.charAt(i)-'0')) + prevCarry;
                int sum= num%10 + arr[idx] + prevSum;
                arr[idx++] = sum%10;
                prevSum =sum/10;
                prevCarry =num/10;
            }
            if(prevSum!=0) arr[idx]+= prevSum;
            if(prevCarry!=0) arr[idx]+=prevCarry;
        }
        int i=arr.length-1;
        while(i>0 && arr[i]==0) i--;
        String ans="";
        while(i>=0) ans+=arr[i--];
        return (ans);
    }
}