// Last updated: 8/7/2025, 2:47:40 PM
class Solution {
    public char repeatedCharacter(String s) {
       HashMap<Character,Integer> h=new HashMap();
       for(int i=0;i<s.length();i++)
       {
        char ch=s.charAt(i);
        if(h.containsKey(ch)) return ch;
        else h.put(ch,1);
       
       } 
       return '1';
    }
}