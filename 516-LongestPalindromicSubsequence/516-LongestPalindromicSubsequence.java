// Last updated: 8/7/2025, 2:54:57 PM
class Solution {
    int dp[][];
    public int longestPalindromeSubseq(String s) {
        StringBuilder t =new StringBuilder(s);
        t.reverse();
        dp=new int[s.length ()][s.length()];
        for(int i[]:dp){
            Arrays.fill (i,-1);
        }
        return find(s,t.toString(),s.length()-1,t.length()-1);
    }
    int find(String s,String t,int i,int j){
        if(i<0 || j<0) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        if(s.charAt (i) == t.charAt (j)){
            return dp[i][j]=find (s,t,i-1,j-1)+1;
        }else{
            return dp[i][j]=Math.max (find(s,t,i-1,j),find(s,t,i,j-1));
        }
    }
}