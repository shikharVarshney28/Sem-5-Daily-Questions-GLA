// Last updated: 8/7/2025, 3:00:19 PM
class Solution {
    public int lengthOfLastWord(String s) {
        int count=0;
        for(int i=s.length()-1;i>=0;i--)
        {
            if(s.charAt(i)!=' ') count++;
            if (i==0) return count;
            if (s.charAt(i)!=' ' && s.charAt(i-1)== ' ') break;
        }
        return count;
    }
}