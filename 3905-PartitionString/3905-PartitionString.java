// Last updated: 8/7/2025, 2:43:03 PM
class Solution {
    public List<String> partitionString(String s) {
        HashSet<String>hSet= new HashSet <>();
        List<String>ans=new ArrayList <>();
        int i=0;
        while(i<s.length ()){
            int j=i+1;
            while(j<=s.length() && hSet.contains(s.substring (i,j))) j++;
            if(j>s.length()){
                i=j;
                continue;
            }
            ans.add(s.substring(i,j));
            hSet.add (s.substring(i,j)) ;
            i=j;
        }
        return ans;
    }
}