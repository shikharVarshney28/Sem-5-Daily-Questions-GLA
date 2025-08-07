// Last updated: 8/7/2025, 2:58:54 PM
class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        String s1="";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if((ch>='a' && ch<='z')||(ch>='0' && ch<='9')) s1+=ch;
        }
        int n=s1.length();
        System.out.print(n+" "+s1);
        for(int i=0;i<n/2;i++)
        {
            int last=n-i-1;
            if(s1.charAt(i)!=s1.charAt(last)) return false;
        }
        return true;
    }
}