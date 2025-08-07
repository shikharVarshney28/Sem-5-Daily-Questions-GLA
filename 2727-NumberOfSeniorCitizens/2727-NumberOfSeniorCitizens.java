// Last updated: 8/7/2025, 2:46:18 PM
class Solution {
    public int countSeniors(String[] details) {
        int count=0;
        for(String s:details)
        {
           if((s.charAt(11)-'0')*10+(s.charAt(12)-'0')>60)
             count++;
        }
        return count;
    }
}