// Last updated: 8/7/2025, 3:01:15 PM
class Solution {
    public int lengthOfLongestSubstring(String s){
        int i=0,count=0,start=0,ans=0;
        String temp="";
        while(i<s.length ()){
            char ch=s.charAt (i);
            int t=start;
            boolean flag=false;
            while(t<i) {
                if(s.charAt (t) == ch){
                    flag=true;
                    break;
                }
                t++;
            }
            //System.out.println (start +" " +t);
            if(flag) start= t+1;
            ans=Math.max (ans,i-start+1);
            i++;
        }
        return ans;

    }
}