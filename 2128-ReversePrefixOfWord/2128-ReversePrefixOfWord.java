// Last updated: 8/7/2025, 2:48:44 PM
class Solution {
    public String reversePrefix(String word, char ch) {
        int idx=-1,st=0;
        for(idx=0;idx<word.length();idx++){
            if(word.charAt(idx)==ch) break;
        }
        if(idx==word.length()) return word;
        StringBuilder s=new StringBuilder(word);
        while(st<idx){
            char temp=word.charAt(st);
            s.setCharAt(st,s.charAt(idx));
            s.setCharAt(idx,temp);
            st++;idx--;
        }
        return s.toString();
    }
}