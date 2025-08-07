// Last updated: 8/7/2025, 3:01:12 PM
class Solution {
    boolean isPalindrome(String str)
    {
        int i=0,j=str.length()-1;
        while(i<j)
        {
            if(str.charAt(i)!=str.charAt(j)) return false;
            i++;j--;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        String temp="",maxStr="";
        if(s.length()<2) return s;
        int max=0;
        for(int i=0;i<s.length()-1;i++)
        {
            for(int j=i+1;j<=s.length();j++)
            {
                temp=s.substring(i,j);
                if(isPalindrome(temp)==true)
                {
                    if(max < temp.length()){
                    maxStr=temp; 
                    max=temp.length();
                    }

                }
            }
            //if(isPalindrome(temp)==true) break;
        }
        return maxStr;
    }
}