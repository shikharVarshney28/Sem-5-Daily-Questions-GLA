// Last updated: 8/7/2025, 2:43:09 PM
class Solution {
    public int minDeletion(String s, int k) {
        int freq[]=new int[26];
        PriorityQueue <Integer>pq=new PriorityQueue <>();
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        int c=0;
        for(int i=0;i<26;i++){
            if(freq[i]!=0) {
                pq.add (freq[i]);
                c++;
            }
        }
        int req=c - k , ans=0;
        //System.out.println (pq);
        while(req>0){
            ans+=pq.poll ();
            req--;
        }
        return ans;
    }
}