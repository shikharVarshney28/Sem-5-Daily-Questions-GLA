// Last updated: 8/7/2025, 2:51:50 PM
class Solution {
    public String makeFancyString(String s) {
        int n= s.length();
        int freq []=new int[n];
        freq[0]=1;
        StringBuilder  ans=new StringBuilder();
        ans.append(s.charAt(0));
        for(int i=1;i<n;i++){
            if(s.charAt(i)!=s.charAt(i-1)) freq[i]=1;
            else freq[i]=freq[i-1]+1;
            if(freq[i]<3) ans.append(s.charAt(i));
        }
        return ans.toString();
    }
}