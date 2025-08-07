// Last updated: 8/7/2025, 2:54:52 PM
class Solution {
    int find(int n,int num,int idx){
       if(idx>n) return 1;
        int ans=0;
        //System.out.println (num+" "+idx);
        for(int i=1;i<=n;i++){
            if((num | 1<<i)==num) continue;
            //System.out.println (i);  
            if(idx%i==0 || i%idx==0)
            ans+=find(n,num | 1<<i,idx+1);
        }
        return ans;
    }
    public int countArrangement(int n) {
        return find(n,1,1);
    }
}