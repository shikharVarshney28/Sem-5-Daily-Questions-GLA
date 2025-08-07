// Last updated: 8/7/2025, 2:43:44 PM
class Solution {
    public int maxDifference(String s) {
        int max=Integer.MIN_VALUE;
        int arr[]=new int[26];
        for(int i=0;i<s.length ();i++){
            arr[s.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            if(arr[i]==0 || arr[i]%2==0) continue;            
            for(int j=0;j<26;j++){
                if(arr[j]==0 || arr[j]%2!=0 || i==j) continue;
                max = Math.max (max,arr[i]-arr[j]);
            }
        }
        return max;
    }
}