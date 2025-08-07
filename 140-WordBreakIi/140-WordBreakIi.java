// Last updated: 8/7/2025, 2:58:40 PM
class Solution {
    List<String> res;
    void find(String s,HashSet<String>hSet,int idx,String ans){
        if(s.length()==0){
           res.add(ans.substring(0,ans.length()-1));
            return;
        }
        for(int i=1;i<=s.length();i++){
            String sub = s.substring(0,i);
            if(hSet.contains(sub)){
                find(s.substring (i),hSet,idx+i,ans+sub+" ");
            }
        }
    }
    public List<String> wordBreak(String s, List<String> wordDict) {
        HashSet<String>hSet = new HashSet <>(wordDict);
        res = new ArrayList <>();
        find(s,hSet,0,"");
        return res;
    }
}