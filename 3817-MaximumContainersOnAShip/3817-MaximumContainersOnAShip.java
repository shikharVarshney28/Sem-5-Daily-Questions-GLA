// Last updated: 8/7/2025, 2:43:28 PM
class Solution {
    public int maxContainers(int n, int w, int maxWeight) {
        int ans=0,t=n*n;
        long netWeight=0;
        while(t>0 && netWeight+w <=maxWeight){
            ans+=1;
            netWeight+=w;
            t--;
        }
        return ans;
    }
}