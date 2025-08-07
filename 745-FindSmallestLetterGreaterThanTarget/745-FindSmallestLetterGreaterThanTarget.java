// Last updated: 8/7/2025, 2:53:53 PM
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        for(int i=0;i<letters.length;i++)
        {
            if(letters[i]>target) return letters[i];
        }
        return letters[0];
    }
}