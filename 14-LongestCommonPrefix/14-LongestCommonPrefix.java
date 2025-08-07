// Last updated: 8/7/2025, 3:01:04 PM
class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs,(a,b)-> a.length() - b.length());
        StringBuilder s= new StringBuilder(strs[0]);
        for(int i=1;i<strs.length;i++){
            int j=0;
            while(j<strs[i].length() && j<s.length()){
                if(s.charAt (j) != strs[i].charAt(j)) break;
                j++;
            }
            s.delete(j,s.length());
        }
        return s.toString ();
    }
}