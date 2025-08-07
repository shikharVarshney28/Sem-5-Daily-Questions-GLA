// Last updated: 8/7/2025, 2:49:43 PM
class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character> h=new HashSet<>();
        for(int i=0;i<allowed.length();i++) h.add(allowed.charAt(i));
        int ans=0;
        for(int i=0;i<words.length;i++)
        {
            int c=0;
            for(int j=0;j<words[i].length();j++){
                if(!h.contains(words[i].charAt(j))){
                    c=0;
                    break;
                }else{
                    c=1;
                }
            }
            ans+=c;
        }
        return ans;
    }
}