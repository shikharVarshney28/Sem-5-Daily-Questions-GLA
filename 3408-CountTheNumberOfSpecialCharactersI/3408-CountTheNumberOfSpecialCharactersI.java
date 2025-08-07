// Last updated: 8/7/2025, 2:45:01 PM
class Solution {
    public int numberOfSpecialChars(String word) {
        int f[]=new int[26];
        int f2[]=new int[26];
        for(int i=0;i<word.length();i++)
        {
            char ch=word.charAt(i);
            if(ch>='a' && ch<='z') f[ch-'a']++;
            else f2[ch-'A']++;
        }
        int count=0;
        for(int i=0;i<26;i++)
        {
            if(f[i]!=0 && f2[i]!=0) count++;
        }

        return count;
    }
}