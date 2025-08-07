// Last updated: 8/7/2025, 2:55:24 PM
class Solution {
    class Pair{
        Character ch;
        int freq;
        Pair(char ch,int freq){
            this.ch=ch;
            this.freq=freq;
        }
    }
    public String frequencySort(String s) {
        PriorityQueue<Pair> pq=new PriorityQueue<>((a,b)->(b.freq-a.freq));
        int freq[]=new int[26];
        int Freq[]=new int[26];
        int digi[]=new int[10];
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
                Freq[s.charAt(i)-'A']++;
            }
            else if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                digi[s.charAt(i)-'0']++;
            }
            else freq[s.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            if(freq[i]!=0) pq.add(new Pair((char)('a'+i),freq[i]));
            if(Freq[i]!=0) pq.add(new Pair((char)('A'+i),Freq[i]));
            if(i<10){
                if(digi[i]!=0) pq.add(new Pair((char)('0'+i),digi[i]));
            }
        }
        StringBuilder ans=new StringBuilder();
        while(!pq.isEmpty()){
            Pair p=pq.poll();
            for(int i=1;i<=p.freq;i++){
                ans.append(p.ch);
            }
        }
        return ans.toString();
    }
}