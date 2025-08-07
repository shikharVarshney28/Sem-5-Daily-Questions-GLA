// Last updated: 8/7/2025, 2:54:36 PM
class Solution {
    int dp[][][];
    int m = (int)(Math.pow(10,9))+7;
    int find(int n,int np,int na,int nl){
        //ystem.out.println (np+" "+na+" "+nl);

        if(n==0) return 1;
        if(dp[n][na][nl]!=-1) return dp[n][na][nl];
        int p=0,a=0,l=0;
        p = (find(n-1,np+1,na,0))%m; //streak of 'l' is broken
        if(na+1<=1) a=(find(n-1,np,na+1,0))%m; //streak of 'l' broken
        if(nl+1<=2) l =(find(n-1,np,na,nl+1))%m; // prevent ll(on day 2)
        return dp[n][na][nl]=((l+a)%m+p)%m;
    }
    public int checkRecord(int n) {
        dp=new int[n+1][2][3];
        for(int i[][]:dp){
            for(int j[]:i)  
                Arrays.fill(j,-1);
        }
        return find(n,0,0,0);
    }
}