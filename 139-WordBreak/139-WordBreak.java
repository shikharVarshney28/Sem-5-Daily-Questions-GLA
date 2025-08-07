// Last updated: 8/7/2025, 2:58:41 PM
class Solution {
    int dp[];
    boolean find(String s,List<String>a,int idx){
        if(s.length ()==0) return true; if(dp[idx]!=0) return dp[idx]==1;
        boolean f=false;
        for(int i=1;i<=s.length ();i++){
            String t = s.substring(0,i);
            if(a.contains(t)){
                f=f || find(s.substring(i),a,idx+i);
                if(f) {
                    dp[idx]=1;
                    return true;
                }
            }
        }
        dp[idx] = f ?1:-1;
        return f;
    }
    public boolean wordBreak(String s, List<String> wordDict) {
        dp=new int[s.length ()];
        return find(s,wordDict,0);
    }
}