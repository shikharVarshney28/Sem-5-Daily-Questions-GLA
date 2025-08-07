// Last updated: 8/7/2025, 2:56:12 PM
class Solution {
    public String reverseVowels(String s) {
        StringBuilder t = new StringBuilder (s);
        int i =0,j = t.length()-1;
        while(i<j){
            while(i<=j){
                char ch = t.charAt(i);
                if(ch=='a' || ch=='e' || ch == 'i' || ch=='o' || ch=='u'  || ch=='A' || ch=='E' || ch == 'I' || ch=='O' || ch=='U'
                  ) break;
                i++;
            }
            while(j>=i){
                char ch = t.charAt(j);
                if(ch=='a' || ch=='e' || ch == 'i' || ch=='o' || ch=='u' ||
                   ch=='A' || ch=='E' || ch == 'I' || ch=='O' || ch=='U'
                  ) break;
                j--;
            } 
            if(i<j){
                char ch = t.charAt(i);
                t.setCharAt(i,t.charAt(j));
                t.setCharAt(j,ch);
                i++;j--;
            }
        }
        return t.toString();
    }
    
}