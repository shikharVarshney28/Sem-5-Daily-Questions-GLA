// Last updated: 8/7/2025, 2:46:00 PM
class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count=0;
        for(int i:hours) 
            if(i>=target) count++;
        return count;
    }
}