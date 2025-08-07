// Last updated: 8/7/2025, 2:56:32 PM
class Solution {
    public String removeDuplicateLetters(String s) {
        int freq[]=new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt (i)-'a']++;
        }
        Stack<Character> st=new Stack <>();
        boolean pushed[]=new boolean[26];
        int idx=0;
        while(idx<s.length()){
            char ch=s.charAt (idx++);
            if(pushed[ch-'a']){
                freq[ch-'a']--;
                continue;
            }
            while(st.size()>0 && st.peek()>ch && freq[st.peek()-'a']>=1){
                pushed[st.peek()-'a']=false;
                st.pop();
            }
            freq[ch-'a']--;
            pushed[ch-'a']=true;
            st.push(ch);
        }
        String ans="";
        while(st.size()>0) ans=st.pop()+ans;
        return ans;
    }
}