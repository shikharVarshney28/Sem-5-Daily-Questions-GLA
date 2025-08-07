// Last updated: 8/7/2025, 2:57:39 PM
class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> hmap=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char tch=t.charAt(i);
            char sch=s.charAt(i);
            // kya sch exists kr nhi raha hai
            if(!hmap.containsKey(sch))
            {
                //lets see first whether its value exitst in map before putting
                if(hmap.containsValue(tch)) return false;
                else hmap.put(sch,tch);
            }
            else
            {
                if(hmap.get(sch)!=tch) return false;
            }
        }
        return true;
    }
}