// Last updated: 8/7/2025, 2:45:42 PM
class Solution {
    public long minimumSteps(String s) {
        long arr[]= new long[s.length()];
        long count=0;
        arr[0]=s.charAt(0)-'0';
        for(int i=1;i<s.length();i++){
            arr[i]=(s.charAt(i)-'0')+arr[i-1];
            if(s.charAt(i)=='0') count+=arr[i];
        }
        return count;
    }
}