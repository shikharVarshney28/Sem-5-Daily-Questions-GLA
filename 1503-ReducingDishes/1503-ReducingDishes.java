// Last updated: 8/7/2025, 2:50:53 PM
class Solution {
    public int maxSatisfaction(int[] satisfaction) {
        Arrays.sort(satisfaction);
        int max=0;
        for(int i=0;i<satisfaction.length;i++){
            int count=1,sum=0;
            for(int j=i;j<satisfaction.length;j++){
                sum+=(satisfaction[j]*count);
                count++;
            }
            max=Math.max(max,sum);
        }
        return max;

    }
}