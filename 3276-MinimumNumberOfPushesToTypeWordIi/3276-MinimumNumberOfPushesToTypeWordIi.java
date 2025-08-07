// Last updated: 8/7/2025, 2:45:27 PM
class Solution {
    public int minimumPushes(String word) {
        int freq[]=new int[26];
        for(int i=0;i<word.length();i++)
        {
            freq[word.charAt(i)-'a']++;
        }
        Arrays.sort(freq);
        int minKeyCount=0,count=0;
        for(int i=25;i>-1;i--)
        {
            minKeyCount=minKeyCount+freq[i]*(count/8+1);
            count++;
        }
        return minKeyCount;
    }
}