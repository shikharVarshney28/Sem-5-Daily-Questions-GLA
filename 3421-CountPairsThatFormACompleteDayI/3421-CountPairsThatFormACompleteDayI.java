// Last updated: 8/7/2025, 2:44:57 PM
class Solution {
    public int countCompleteDayPairs(int[] hours) {
        int count=0;
        for(int i=0;i<hours.length;i++)
        {
            for(int j=i+1;j<hours.length;j++)
            {
                if((hours[i]+hours[j])%24==0) count++;
            }
        }
        return count;
    }
}