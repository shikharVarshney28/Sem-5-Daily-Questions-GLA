// Last updated: 8/7/2025, 2:46:41 PM
class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        HashSet <Integer> hSet=new HashSet <>();
        for(int ban:banned){
            hSet.add(ban);
        }
        int sum=0,count=0;
        for(int i=1;i<=n;i++){
            if(!hSet.contains(i)){
                sum+=i;
                if(sum>maxSum) break;
                count++;
            }

        }
        return count;
    }
}