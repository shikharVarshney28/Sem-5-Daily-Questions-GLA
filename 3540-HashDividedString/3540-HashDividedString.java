// Last updated: 8/7/2025, 2:44:23 PM
class Solution {
    public String stringHash(String s, int k) {
        int i=0,n=s.length();
        String ans="";
        while(i<n){
            String temp=s.substring(i,i+k);
            int sum=0;
            for(int j=0;j<temp.length();j++){
                sum+=(temp.charAt(j)-'a');
            }
            ans=ans+(char)(sum%26+'a');
            i+=k;
        }
        return ans;
    }
}