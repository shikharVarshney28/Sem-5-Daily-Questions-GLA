// Last updated: 8/7/2025, 2:55:55 PM
class Solution {
    boolean find(String s,String t,int i,int j){
        if(i<0) return true;
        if(j<0) return false;
        if(s.charAt(i) == t.charAt(j)){
            return find(s,t,i -1,j -1);
        }
        return find(s,t,i,j-1);
    }
    public boolean isSubsequence(String s, String t) {
        return find(s,t,s.length()-1,t.length()-1);
    }
}