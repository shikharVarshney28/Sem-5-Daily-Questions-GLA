// Last updated: 8/7/2025, 2:55:19 PM
class Solution {
    int dp[][][];
    int[] find(String s){
        int zero=0,one=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0') zero++;
            else one++;
        }
        return new int[]{zero,one};
    }
    int find(int c0[],int c1[],int m,int n,int idx,int len){
        if(idx>=len){
            if(m>=0 && n>=0) return 0;
            return -1; 
        }
        if(m==0 && n==0) return 0;
        if(m<0 || n<0) return -1;
        if(dp[idx][m][n]!=-1) return dp[idx][m][n];
        // yah toh yeh wala subset chose kro or aage bharo
        int chosen=0;
        if(m-c0[idx]>=0 && n-c1[idx]>=0){
            chosen = find(c0,c1,m-c0[idx],n-c1[idx],idx+1,len)+1;
        }
        //yah toh mt kro taki aagle max ans mile and its normal case when the if condn is false;
        return  dp[idx][m][n]=Math.max(find(c0,c1,m,n,idx+1,len),chosen);

    }
    public int findMaxForm(String[] strs, int m, int n) {
        int count0[]=new int[strs.length];
        int count1[]=new int[strs.length];
        for(int i=0;i<strs.length;i++){
            int ans[]=find(strs[i]);
            count0[i]=ans[0];
            count1[i]=ans[1];
        }
        dp=new int[strs.length][m+1][n+1];
        for(int i[][]:dp){
            for(int j[]:i){
                Arrays.fill(j,-1);
            }
        }
        return find(count0,count1,m,n,0,strs.length);
    }
}