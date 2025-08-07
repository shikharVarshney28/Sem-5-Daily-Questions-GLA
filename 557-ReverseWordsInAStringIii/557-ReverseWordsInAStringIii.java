// Last updated: 8/7/2025, 2:54:35 PM
class Solution {
    public String reverseWords(String s) {
        StringBuilder s1=new StringBuilder();
        String temp="";
        String [] str=s.split(" ");
        for(int i=0;i<str.length;i++)
        {
            s1=new StringBuilder(str[i]);
            temp+=s1.reverse();
            if(i!=str.length-1) temp+=" ";
        }
    return temp;
    }
}