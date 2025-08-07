// Last updated: 8/7/2025, 2:52:22 PM
class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder ans = new StringBuilder ();
        int c = 0, j = 0;
        for(int i=0;i<s.length();i++){
            c += ( s.charAt(i)=='(' ? 1 : -1);
            if(c==0){
                ans.append(s.substring(j+1,i));
                j=i+1;
            }
        }
        return ans.toString();
    }
}