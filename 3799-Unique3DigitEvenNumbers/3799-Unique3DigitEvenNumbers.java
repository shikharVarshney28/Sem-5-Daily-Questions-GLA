// Last updated: 8/7/2025, 2:43:34 PM
class Solution {
    HashSet<Integer> hSet;
    public int totalNumbers(int[] digits) {
         hSet = new HashSet <>();
        int n=digits.length;
      boolean vis[]=new boolean[n];
        for(int i=0;i<n;i++){
            if(digits[i]==0) continue;            vis[i]=true;
            canform(digits,n,2,vis,digits[i]);
            vis[i]=false;
        }
        return hSet.size();
    }
    void canform(int [] nums,int n,int k,boolean vis[],int num){
        if(k==0){
            if(num%2==0) hSet.add(num);
            return;
        }
        for(int i=0;i<n;i++){
            if(vis[i]) continue;
            vis[i]=true;
            canform(nums,n,k-1,vis,num*10+nums[i]);
            vis[i]=false;
        }
    }
}