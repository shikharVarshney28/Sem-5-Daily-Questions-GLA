// Last updated: 8/7/2025, 2:50:13 PM
class Solution {
    static StringBuilder invert(StringBuilder s){
        for(int i=0;i<s.length();i++){
        char ch= s.charAt(i)=='0' ? '1' : '0' ;
        s.setCharAt(i,ch);
    }
        return s;
 }
                                                    static String findString(String s,int n){
        if(n==1) return s+0;
        String sn=findString(s,n-1);
        StringBuilder invt=invert(new StringBuilder(sn));
        return sn+"1" +(invt.reverse().toString());
    }
    public char findKthBit(int n, int k) {
        return findString("",n).charAt(k-1);
    }
}