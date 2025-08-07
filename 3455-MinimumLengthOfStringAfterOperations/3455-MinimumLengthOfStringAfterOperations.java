// Last updated: 8/7/2025, 2:44:41 PM
class Solution {
    public int minimumLength(String s) {
        int ans=0;
        int [] arr=new int[26];
        for(int i=0;i<s.length ();i++){
            arr[s.charAt (i) - 'a']++;
        }
        for(int i=0;i<26;i++){
            if(arr[i]!=0 && arr[i]%2==0) ans+=2;
            else if(arr[i]%2!=0) ans+=1;
        }
        return ans;
    }
}