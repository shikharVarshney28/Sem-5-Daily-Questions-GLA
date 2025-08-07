// Last updated: 8/7/2025, 2:44:10 PM
class Solution {
    public char kthCharacter(int k) {
        StringBuilder s=new StringBuilder ();
        s.append('a');
        while(s.length()<k){
            int n = s.length();
            for(int i=0;i<n;i++){
                if(s.charAt(i)=='z') s.append('a');
                else s.append((char)(s.charAt (i)+1));
            }
            //System.out.println (s);
        }
        return s.charAt(k-1);
    }
}