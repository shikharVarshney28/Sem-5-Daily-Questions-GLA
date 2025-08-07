// Last updated: 8/7/2025, 2:54:16 PM
class Solution {
    public int countSubstrings(String s) {
        int countOddLength=0,countEvenLength=0;
        //odd length ke liye
        for(int axis=0;axis<s.length();axis++){
            for(int orbit=0;axis-orbit>=0 && axis+orbit<s.length();orbit++){
                if(s.charAt(axis-orbit) == s.charAt(axis+orbit)) countOddLength++;
                else break;
            }
        }
        // now for even length
        for(double axis=0.5;axis<s.length();axis++){
            for(double orbit=0.5;axis-orbit>=0 && axis+orbit<s.length();orbit++){
                if(s.charAt((int)(axis-orbit)) == s.charAt((int)(axis+orbit))) countEvenLength++;
                else break;
            }
        }
        return (countEvenLength+countOddLength);
    }
}