// Last updated: 8/7/2025, 2:51:08 PM
class Solution {
    public int minSteps(String s, String t) {
        int[] freq=new int[26];
        for(int i=0;i<s.length();i++) freq[s.charAt(i)-'a']++;
        //Now deleting the freq
        for(int i=0;i<t.length();i++)
        {
            char ch=t.charAt(i);
            if(freq[ch-'a']!=0)
                freq[ch-'a']--;
        }
        int count=0;
        for(int i=0;i<26;i++) count+=freq[i];
        return count;
    }
}