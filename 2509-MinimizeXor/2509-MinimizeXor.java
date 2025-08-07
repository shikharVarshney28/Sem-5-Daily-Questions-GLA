// Last updated: 8/7/2025, 2:47:08 PM
class Solution {
    public int minimizeXor(int num1, int num2) {
        int n = Integer.bitCount(num2);
        StringBuilder s = new StringBuilder();
        StringBuilder a = new StringBuilder(Integer.toBinaryString(num1));
        StringBuilder b = new StringBuilder(Integer.toBinaryString(num2));
        int num = Math.max(a.length(), b.length());
        int m = a.length(), o = b.length();
        for (int i = 0; i < o - m; i++)
            a.insert(0, '0');
        for (int i = 0; i < num; i++)
            s.append(0);
        int i = 0;
        while (i < num && n > 0) {
            if (a.charAt(i) == '1') {
                s.setCharAt(i, '1');
                n--;
            }
            i++;
        }
        i = num - 1;
        //System.out.println (a+" "+n);
        while (i >= 0 && n > 0) {
            if (s.charAt(i) != '1') {
                //System.out.println (i+"h"+s);
                s.setCharAt(i, '1');
                n--;
            }
            i--;
        }
        //System.out.println(s);
        return Integer.parseInt(s.toString(), 2);
    }
}