// Last updated: 8/7/2025, 2:43:58 PM
class Solution {
    public int smallestNumber(int n) {
        int size=Integer.toBinaryString (n).length();
        String temp="";
        for(int i=1;i<=size;i++) temp+=1;
        return Integer.parseInt(temp,2);
    }
}