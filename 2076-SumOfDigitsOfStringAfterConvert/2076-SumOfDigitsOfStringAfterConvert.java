// Last updated: 8/7/2025, 2:48:50 PM
class Solution {
    public int getLucky(String s, int k) {
        String ans="";
        for(int i=0;i<s.length();i++)
        {
             ans=ans+(s.charAt(i)-'a'+1);
        }
        while(k!=0)
        {
            int temp=0;
            for(int i=0;i<ans.length();i++){
            temp+=(ans.charAt(i)-'0');
            }
            ans=""+temp;
            k--;
        }
                                                                                                              return Integer.parseInt(ans);
    }
}