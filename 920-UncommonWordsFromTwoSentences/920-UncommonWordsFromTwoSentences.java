// Last updated: 8/7/2025, 2:53:03 PM
class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String,Integer> hmap=new HashMap<>();
        for(String s:s1.split(" ")){
            if(!hmap.containsKey(s)) hmap.put(s,1);
            else hmap.put(s,hmap.get(s)+1);
        }
        for(String s:s2.split(" ")){
            if(!hmap.containsKey(s)) hmap.put(s,1);
            else hmap.put(s,hmap.get(s)+1);
        }
        String ans="";
        for(String s:hmap.keySet()){
            if(hmap.get(s)==1) ans=ans+s+" ";
        }
        if(ans.equals("")) return new String[0];
        return ans.split(" ");
    }
}