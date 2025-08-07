// Last updated: 8/7/2025, 2:47:58 PM
class Solution {
    public int minBitFlips(int start, int goal) {
        String f=Integer.toBinaryString(start^goal);
                int count=0;
                        for(int i=0;i<f.length();i++){
                                    if(f.charAt(i)=='1') count++;
                                            }
                                                    return count;
    }
}