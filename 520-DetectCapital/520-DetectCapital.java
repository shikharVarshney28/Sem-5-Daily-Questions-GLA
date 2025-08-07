// Last updated: 8/7/2025, 2:54:54 PM
class Solution {
    public boolean detectCapitalUse(String word) {
        if(word.charAt(0)>='A' && word.charAt(0)<='Z'){
            word =  word.substring(1);
            boolean f=false;
            for(int i=0;i<word.length();i++){
                //all are upper case
                if(word.charAt(i)>='a' && word.charAt(i)<='z') {
                    f=true;
                    break;
                }
            }
            if(!f) return true;
            for(int i=0;i<word.length();i++){
                //all are lower case
                if(word.charAt(i)>='A' && word.charAt(i)<='Z') {
                    f=true;
                    return false;
                }
            }
            return true;
        }
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)>='A' && word.charAt(i)<='Z') return false;
        }
        return true;
    }
}