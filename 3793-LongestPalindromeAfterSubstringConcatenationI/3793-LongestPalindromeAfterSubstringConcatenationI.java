// Last updated: 8/7/2025, 2:43:36 PM
class Solution {
    public int longestPalindrome(String s, String t) {
        int ans=0;
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length ();j++){
                if(isPalindrome(s.substring(i,j))){
                    ans= Math.max (ans,s.substring(i,j).length());
                }
            }
        }
        for(int i=0;i<t.length();i++){
            for(int j=i+1;j<=t.length();j++){
                if(isPalindrome(t.substring(i,j))){
                    ans= Math.max (ans,t.substring(i,j).length());
                }
            }
        }
        for(int i=0;i<s.length ();i++){
            for(int j=i+1;j<=s.length ();j++){
                for(int k=0;k<t.length();k++){
                    for(int l=k+1;l<=t.length ();l++){
                        String res = s.substring(i,j)+ t.substring(k,l);
                        if(isPalindrome(res)){
                            ans= Math.max (ans,res.length());                        }
                    }
                }
            }
        }
        return ans;
    }
    boolean isPalindrome(String s){
        int i=0,j=s.length ()-1;
        while(i<=j){
            if(s.charAt (i)!=s.charAt (j)) return false;
            i++;
            j--;
        }
        return true;
    }
}