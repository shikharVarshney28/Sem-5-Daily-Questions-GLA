// Last updated: 8/7/2025, 2:48:39 PM
class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x=0;
        for(String s:operations)
        {
            if(s.equals("--X")) --x;
            else if(s.equals("++X")) ++x;
            else if(s.equals("X--")) x--;
            else x++;
        }
        return x;
    }
}