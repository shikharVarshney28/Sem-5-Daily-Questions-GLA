// Last updated: 8/7/2025, 2:53:24 PM
class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        HashMap<String,Integer> hmap=new HashMap<>();
        paragraph=paragraph.toLowerCase();
        String s="";
       
        for(int i=0;i<paragraph.length();i++)
        {
            char ch=paragraph.charAt(i);
            if(ch>='a' && ch<='z') s+=ch;
            if(ch==' ' || ch==',')
            {
                if(!hmap.containsKey(s)) hmap.put(s,1);
                else hmap.put(s,hmap.get(s)+1);
                s="";
                continue;
            }
        }
       
        if(!hmap.containsKey(s)) hmap.put(s,1);
        else hmap.put(s,hmap.get(s)+1);
        // Removing all string[i] in hashMap
       for(String i:banned)
       {
            hmap.remove(i);
       }
       hmap.remove("");
       int max_count=0;
       System.out.print(hmap);
       for(String i:hmap.keySet())
       {
            if(max_count<hmap.get(i))
            {
                max_count=hmap.get(i);
                s=i;
            }
       }
        return s;
    }
}