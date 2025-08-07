// Last updated: 8/7/2025, 2:48:32 PM
class Solution {
    public String kthDistinct(String[] arr, int k) {
        HashMap<String,Integer> hmap=new HashMap<>();
        for(String s:arr)
        {
            if(!hmap.containsKey(s)) hmap.put(s,1);
            else hmap.put(s,hmap.get(s)+1);
        }
        int stop=0;
        for(String s:arr)
        {
            if(hmap.get(s)==1){
                stop++;
                if(stop==k) return s;
                
            }
        }
        return "";
    }
}