// Last updated: 8/7/2025, 2:57:02 PM
class Solution {
    public boolean searchMatrix(int[][] sq, int target) {
        int st=0,end=sq[0].length-1;
        int row=sq.length,col=sq[0].length;
        while(st<row && end>=0)
        {
            if(sq[st][end]==target) return true;
            if(sq[st][end]>target) end--;
            else if(sq[st][end]<target) st++;
        }
        return false;
    }
}