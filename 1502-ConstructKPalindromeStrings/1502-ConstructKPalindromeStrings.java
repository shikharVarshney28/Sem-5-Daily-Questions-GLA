// Last updated: 8/7/2025, 2:50:55 PM
class Solution {
    public boolean canConstruct(String s, int k) {
        int n=s.length ();
        if(n<k) return false;
        if(n==k) return true;
        // otherwise find freq count
        int []arr=new int[26];
        for(int i=0;i<n;i++){
            arr[s.charAt (i)-'a']++;
        }
        int oddCount=0;
        for(int i=0;i<26;i++){
            if(arr[i]%2!=0) oddCount++;
        }
        return oddCount<=k;
    }
}