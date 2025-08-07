// Last updated: 8/7/2025, 2:45:05 PM
class Solution {
    public int scoreOfString(String s) {
        int sum=0;
        for(int i=0;i<s.length()-1;i++)
        {
            char ch=s.charAt(i);
            char gh=s.charAt(i+1);
            sum=sum+(int)Math.abs(ch-gh);
        }
        return sum;
    }
}