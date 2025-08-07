// Last updated: 8/7/2025, 2:45:54 PM
class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
        int idx=0;
        for(int i=0;i<str1.length();i++){
            if(idx==str2.length()) return true;
            //Case one:- if both are same
            if((str1.charAt(i)==str2.charAt(idx) || (str2.charAt(idx)-str1.charAt(i))==1) || (str1.charAt(i)=='z' && str2.charAt(idx)=='a')){
                idx++;
            }
        }
        return idx==str2.length();
    }
}