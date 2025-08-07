// Last updated: 8/7/2025, 2:56:33 PM
import java.math.BigInteger;
class Solution {
    boolean find(String s, int idx, int len, BigInteger prevEle1, BigInteger prevEle2) {
        if (s.length() == 0 && len >= 3)
            return true;
        boolean f = false;
        for (int i = 1; i <= s.length(); i++) {
            String m = s.substring(0, i);
            
            BigInteger n = new BigInteger(m);
            if(n.compareTo(new BigInteger("0"))>0 && m.charAt(0)=='0') return false; // leading zero partition 
            // if(n==0) return false;
            if (len < 2 || (prevEle2.add(prevEle1).compareTo(n)==0)) {
                int pe = 0;
                /*if(prevEle1 == -1){ 
                   prevEle1 = n;
                }else if(prevEle2==-1){
                    prevEle2=n;
                }else{
                    pe=prevEle1;
                      
                    prevEle1 = prevEle2;
                    prevEle2=n;
                }*/
                f = f || find(s.substring(i), idx + i, len + 1, prevEle2, n);
            }
            if (f)
                return true;
        }
        return f;
    }

    public boolean isAdditiveNumber(String num) {
        List<Integer> ans = new ArrayList<>();
        ans.add(0);
        return find(num, 0, 0, new BigInteger("0"), new BigInteger("0"));
    }
}