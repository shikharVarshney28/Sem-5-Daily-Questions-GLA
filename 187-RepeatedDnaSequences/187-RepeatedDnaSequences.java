// Last updated: 8/7/2025, 2:57:50 PM
class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        HashSet<String> hSet = new HashSet <>();
        Set<String>arr= new HashSet<>();
        for(int i=0;i<=s.length ()-10;i++){
            String t = s.substring (i,i+10);
            if(hSet.contains(t)){
                arr.add(t);
            }
            hSet.add(t);
        }
        return new ArrayList <>(arr);
    }
}