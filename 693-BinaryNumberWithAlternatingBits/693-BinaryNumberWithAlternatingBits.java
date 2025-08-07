// Last updated: 8/7/2025, 2:54:07 PM
class Solution {
    public boolean hasAlternatingBits(int n) {
        String s=Integer.toBinaryString(n);
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1)) return false;
        }
        return true;
    }
}