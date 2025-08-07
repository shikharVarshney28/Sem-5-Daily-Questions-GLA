// Last updated: 8/7/2025, 2:59:30 PM
class Solution {
    int dp[];
    public int numDecodings(String s) {
        dp=new int[s.length()];
        Arrays.fill(dp,-1);
        return (find(s,0));
    }
    int find(String s,int idx){
        if(s.length()==0) return 1;
        if(dp[idx]!=-1) return dp[idx];
        int ans=0;
        for(int i=1;i<=2;i++){
            if(i>s.length()) return ans;
            String sub = s.substring(0,i);
            if(sub.charAt(0)!='0' && Integer.parseInt(sub)>=1 && Integer.parseInt(sub)<27){
                //this is a valid split
                ans+= find(s.substring(i),idx+i);
            }
        }
        return dp[idx]=ans;
    }
}