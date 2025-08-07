// Last updated: 8/7/2025, 3:00:25 PM
class Solution{
    public String find(String s){
        char arr[]=s.toCharArray ();
        Arrays.sort (arr);
        StringBuilder snew = new StringBuilder ();
        for(char ch : arr){
            snew.append(ch);
        }
        return snew.toString();
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hmap = new HashMap <>();
        for(String s:strs){
            String cmp = find(s);
            if(hmap.containsKey (cmp)){
               hmap.get(cmp).add(s);
            }else{
                hmap.put(cmp,new ArrayList <>());
             hmap.get(cmp).add(s);
            }
        }
        List<List<String>> ans= new ArrayList <>();
        for(String s : hmap.keySet ()){
            ans.add(new ArrayList<>(hmap.get(s)));
        }
        return ans;
    }
}