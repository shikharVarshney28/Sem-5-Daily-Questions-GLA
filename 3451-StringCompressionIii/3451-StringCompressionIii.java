// Last updated: 8/7/2025, 2:44:44 PM
class Solution {
    public String compressedString(String word) {
        HashMap<Character,Integer> hmap=new HashMap<>();
        ArrayList<Integer> arr=new ArrayList <>();
        String ans="";
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(!hmap.containsKey(ch)){
                hmap.put (ch,1);
                
                if(arr.size()>0){
                    int idx= arr.remove(arr.size()-1);
                    ans = ans + hmap.get (word.charAt(idx)) + word.charAt (idx);
                    hmap.remove(word.charAt (idx));
                }
                arr.add (i);
            }
            else {
                hmap.put (ch,hmap.get (ch)+1);
                if(hmap.get (ch)==9){
                    ans = ans + hmap.get (ch) + ch;
                    hmap.remove (ch);
                    arr.remove(arr.size()-1);
                }
            }

        } 
        if(arr.size()>0){
        int idx=arr.get(arr.size()-1);
        ans = ans + hmap.get(word.charAt(idx)) + word.charAt(idx);}
        return ans;

    }
}