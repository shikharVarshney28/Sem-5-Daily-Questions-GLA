// Last updated: 8/7/2025, 2:58:24 PM
class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String [] arr=s.split(" +");
        String ans="";
        for(int i=arr.length-1;i>=0;i--){
            ans=ans+arr[i]+" ";
        }
        return ans.trim();
    }
}