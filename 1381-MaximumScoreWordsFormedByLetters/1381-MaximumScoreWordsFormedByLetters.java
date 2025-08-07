// Last updated: 8/7/2025, 2:51:37 PM
class Solution {
    public int maxScore(String [] words,int []freq,int [] score,int idx,int count,int ans[]){
        int max=0;
        //base case
        if(idx>=words.length) return 0;
        //first reduce the freq count
        String word=words[idx];
        for(int i=0;i<word.length();i++){
            char ch=word.charAt (i);
            if(freq[ch-'a']==0) {
                for(int j=0;j<i;j++) freq[word.charAt (j) -'a']++;
                return 0;
            }
            freq[ch-'a']--;
            count+=score[ch-'a'];
        }
        for(int i=idx;i<words.length;i++){
            max=Math.max (max,maxScore(words,freq,score,i+1,0,ans));
            //System.out.println (word+" "+max);
        }
        //BackTrakking
        for(int i=0;i<word.length();i++){
            freq[word.charAt (i)-'a']++;
        }
        System.out.println (max+" "+count);
        return count+max;
    }
    public int maxScoreWords(String[] words, char[] letters, int[] score) {
        int count[]=new int[26];
       // int []=new int[26];
        for(int i=0;i<letters.length;i++) 
            count[letters[i]-'a']++;
            int ans[]={0};
            int max=0;
            for(int i=0;i<words.length;i++){
                max=Math.max(maxScore(words,count,score,i,0,ans ),max);
                //System.out.println (words[i]+"ka max "+x);
                //max=x;
            }
        return max;
    }
}