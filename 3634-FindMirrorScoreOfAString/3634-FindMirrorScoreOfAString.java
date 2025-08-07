// Last updated: 8/7/2025, 2:44:05 PM
class Solution {
    public long calculateScore(String s) {
        HashMap<Character,Stack<Integer>> hmap=new HashMap <>();
        long ans=0;
        for(int i=0;i<s.length ();i++){
            char ch=s.charAt(i);
            char mirror = (char)('z' - (ch -'a'));
            if(!hmap.containsKey(mirror)){
                //yeh kiska mirror ho skta hai
                if(!hmap.containsKey (ch)){
                    Stack<Integer> st=new Stack <>();
                    st.push(i);
                    hmap.put (ch,st);
                }else{
                    Stack<Integer> st=hmap.get (ch);
                    st.push(i);
                    hmap.put (ch,st);
                }

            }else{
                Stack<Integer> st=hmap.get(mirror);
                int val=st.pop ();
                ans+=(i - val);
                if(st.isEmpty ()) hmap.remove(mirror);
                else hmap.put (mirror,st);

            }
        }
        return ans;
    }
}