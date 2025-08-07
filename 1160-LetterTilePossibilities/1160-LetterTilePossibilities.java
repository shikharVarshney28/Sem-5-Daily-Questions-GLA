// Last updated: 8/7/2025, 2:52:10 PM
class Solution {
    int count=0;
    void find(StringBuilder s,int arr[],int n){
        if(s.length()==n) return;
        for(int i=0;i<26;i++){
            if(arr[i]!=0){
                char ch=(char)(i+'A');
                arr[i]--;
                count++;
                s.append(ch);
                find(s,arr,n);
                arr[i]++;
                s.deleteCharAt(s.length()-1);
            }
        }
    
    }
    public int numTilePossibilities(String s) {
        //HashMap <Character,Integer> hmap=new HashMap<>();
        int arr[]=new int[26];
        for(int i=0;i<s.length ();i++) arr[s.charAt(i)-'A']++;
        find(new StringBuilder (),arr,s.length());
        return count;
        
    }
}


