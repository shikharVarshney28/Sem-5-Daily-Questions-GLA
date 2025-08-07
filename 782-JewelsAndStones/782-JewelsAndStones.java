// Last updated: 8/7/2025, 2:53:41 PM
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int freq[]=new int[26];
        int Freq[]=new int[26];
        for(int i=0;i<stones.length();i++)
        {
            char ch=stones.charAt(i);
            if(ch>='a' && ch<='z') freq[ch-'a']++;
            else Freq[ch-'A']++;        
        }
        int count=0;
        for(int i=0;i<jewels.length();i++)
        {
            char ch=jewels.charAt(i);
            if(ch>='a' && ch<='z') count+=freq[ch-'a'];
            else count+=Freq[ch-'A'];
        }
        return count;
    }
}