// Last updated: 8/7/2025, 2:56:00 PM
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> h=new HashMap<>();
        for(int i=0;i<magazine.length();i++)
        {
            char ch=magazine.charAt(i);
            if(!h.containsKey(ch)) h.put(ch,1);
            else h.put(ch,h.get(ch)+1);
        }
        System.out.println(h);
        for(int i=0;i<ransomNote.length();i++)
        {
            char ch=ransomNote.charAt(i);
            if(h.containsKey(ch) && h.get(ch)>0)
            {
                h.put(ch,h.get(ch)-1);
            }
            else return false;
        }
        return true;
    }
}