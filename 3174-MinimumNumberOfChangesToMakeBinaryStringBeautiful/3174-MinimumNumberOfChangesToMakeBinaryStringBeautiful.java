// Last updated: 8/7/2025, 2:45:47 PM
class Solution {
    public int minChanges(String s) {
        int change=0;
        for(int i=0;i<s.length()-1;i+=2){
            if(s.charAt(i)!= s.charAt(i+1)) change++;
        }
        return change;
    }
}