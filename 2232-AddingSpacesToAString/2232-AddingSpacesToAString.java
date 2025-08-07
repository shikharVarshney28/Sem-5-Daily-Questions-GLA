// Last updated: 8/7/2025, 2:48:16 PM
class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder ans= new StringBuilder ();
        int idx=0;
        for(int i=0;i<s.length();i++){
            if(idx<spaces.length && i==spaces[idx]){
                ans.append(" ");
                idx++;
                i--;
            }else ans.append(s.charAt(i));
        }
        return ans.toString();
    }
}