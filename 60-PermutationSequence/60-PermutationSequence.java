// Last updated: 8/7/2025, 3:00:07 PM
class Solution {
    List<String>ans;
    void find(int n,int k,String s,int mask){
        if(mask == Math.pow(2,n+1)-2){
            ans.add(s);
            return;
        }
        for(int i=1;i<=n;i++){
            if((mask | (1<<i)) == mask) continue;
            find(n,k,s+i,mask|(1<<i));
            if(ans.size()>=k) return;
        }
    }   
    public String getPermutation(int n, int k) {
        ans=new ArrayList <>();    
        find(n,k,"",0);
        //System.out.println (ans);
        
        return ans.get(k-1);
    }
}