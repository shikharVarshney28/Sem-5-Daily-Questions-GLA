// Last updated: 8/7/2025, 2:55:56 PM
class Solution {
    public char findTheDifference(String s, String t) {
        int []f=new int[26];
        for(int i=0;i<t.length();i++)
            f[t.charAt(i)-'a']++;
        for(int i=0;i<s.length();i++)
        f[s.charAt(i)-'a']--;
        int k;
        for(k=0;k<26;k++)
            if(f[k]==1) break;
        char ch=(char)(k+97);
        return ch;
    }
}