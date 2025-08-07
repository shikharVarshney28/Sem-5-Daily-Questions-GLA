// Last updated: 8/7/2025, 2:45:48 PM
class Solution {
    public int differenceOfSums(int n, int m) {
        int ans=0;
        for(int i=1;i<=n;i++)
        {
            if(i%m==0) ans-=i;
            else ans+=i;
        }
        return ans;
    }
}