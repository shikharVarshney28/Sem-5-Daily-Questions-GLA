// Last updated: 8/7/2025, 2:43:06 PM
class Solution {
    public String generateTag(String caption) {
        caption = caption.trim();
       // System.out.println (caption); 
        String s[]= caption.split(" ");
        for(int i=0;i<s.length;i++) s[i]=s[i].toLowerCase();
        for(int i=0;i<s.length;i++){
            if(s[i].length()==0) continue;
            if(s[i].length()>100){
                s[i]=s[i].substring(0,99);
            }
            if(i==0){
                s[i]= (s[i].charAt(0)>='A' && s[i].charAt(0)<='Z'     ? (char)(s[i].charAt(0)-'A'    +'a') : s[i].charAt(0) ) + s[i].substring (1);
            }
            else if(s[i].charAt(0)>='a' && s[i].charAt(0)<='z'){
                s[i] = (char)(s[i].charAt(0)-'a'+'A') + s[i].substring(1);
            }
            //System.out.println (s[i]);
        }
       // for(String m : s) System.out.print(m+" ");
        String ans="#";
        for(int i=0;i<s.length;i++){
            if(s[i].length()==0) continue;
            ans+=s[i];
        }
        if(ans.length()>100) ans = ans.substring (0,100);
        return ans;
    }
}