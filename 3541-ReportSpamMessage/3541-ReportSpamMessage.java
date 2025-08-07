// Last updated: 8/7/2025, 2:44:21 PM
class Solution {
    public boolean reportSpam(String[] message, String[] bannedWords) {
        HashSet<String> h=new HashSet<>();
        for(String s:bannedWords) h.add(s);
        int count=0;
        for(String s:message){
            if(h.contains(s)){
                count++;
                if(count>=2) return true;
            }
        }
        return false;
    }
}