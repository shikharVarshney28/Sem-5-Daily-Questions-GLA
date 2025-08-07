// Last updated: 8/7/2025, 2:55:31 PM
class Solution {
    public int compress(char[] chars) {
        HashMap< Character,Integer> hmap=new HashMap <>();
        String ans="";
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<chars.length;){
            char ch=chars[i];
            int count=0;
            int j=i;
            while(j<chars.length && chars[i]==chars[j]){
                count++;
                j++;
            }
            if(count!=1)
            ans = ans + chars[i] + count;
            else ans = ans + chars[i];
            i=j;
        }
        //System.out.println (hmap);
    
       // chars=new char[ans.length()];
        int idx=0;
        for(int i=0;i<ans.length();i++){
            chars[idx++]= ans.charAt(i);
        }
        return ans.length();
    }
}