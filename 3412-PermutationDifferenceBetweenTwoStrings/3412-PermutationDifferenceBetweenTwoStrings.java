// Last updated: 8/7/2025, 2:45:00 PM
class Solution {
    public int findPermutationDifference(String s, String t) {
        int sum=0;
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            int j=0;
            for( j=0;j<t.length();j++)
            {
                if(c==t.charAt(j)) break;
            }
            sum=sum+(int)Math.abs(i-j);
        }
        return sum;
    }
}