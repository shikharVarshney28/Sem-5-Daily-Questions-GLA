// Last updated: 8/7/2025, 2:50:37 PM
class Solution {
    boolean contains(String s, String word){
        int n= word.length();
        if(n>s.length()) return false;
        return s.substring(0,n).equals(word);
    }
    public int isPrefixOfWord(String sentence, String searchWord) {
        String [] arr= sentence.split(" ");
        for(int i=0;i<arr.length;i++){
            if(contains(arr[i],searchWord)){
                return i+1;
            }
        }
        return -1;
    }
}