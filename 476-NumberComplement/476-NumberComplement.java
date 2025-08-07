// Last updated: 8/7/2025, 2:55:17 PM
class Solution {
    public int findComplement(int num) {
        int len= Integer.toBinaryString(num).length();
        StringBuilder s=new StringBuilder();
        while(len-->0) s.append(1);
        return num ^ Integer.parseInt(s.toString(),2);
    }
}