// Last updated: 8/7/2025, 2:56:13 PM
class Solution {
    public void reverseString(char[] s) {
        int start=0,last=s.length-1;
        while(start<last)
        {
            char temp=s[start];
            s[start]=s[last];
            s[last]=temp;
            start++;
            last--;
        }
    }
}