// Last updated: 8/7/2025, 2:52:59 PM
class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> ans=new ArrayList<>();
        for(String s:words)
        {
            HashMap<Character,Character> h=new HashMap<>();
            boolean flag=true;
            for(int i=0;i<s.length();i++)
            {
                char sch=s.charAt(i);
                char tch=pattern.charAt(i);
                if(h.containsKey(sch)){
                    if(h.get(sch)==tch) continue;
                    else{
                        flag=false;
                        break;
                    }
                }
                else if(h.containsValue(tch))
                {
                    flag=false;
                    break;
                }
                else h.put(sch,tch);

            }
            if(flag) ans.add(s);
        }
        return ans;
    }
}