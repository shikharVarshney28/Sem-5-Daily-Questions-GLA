// Last updated: 8/7/2025, 2:53:30 PM
class Solution {
    public boolean rotateString(String s, String goal) {
        int count=1,n=s.length();
        while(count<=n){
            //Shift count times
            String temp1=s.substring(0,count);
            String temp2=s.substring (count);
            String res=temp2+temp1;
            if(goal.equals(res)) return true;
            count++;

        }
        return false;
    }
}