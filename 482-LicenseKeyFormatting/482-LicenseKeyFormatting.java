// Last updated: 8/7/2025, 2:55:16 PM
class Solution {
    public String licenseKeyFormatting(String s, int k) {
        String t[] = s.split("-");
        //for(String m : t) System.out.println (m);
        if(t.length==0) return "";
        StringBuilder sb = new StringBuilder ();
        for(String m : t ) sb.append(m);
        String ans ="";
        int i=sb.length()-1;
        while(i>=k-1){
            String sub = sb.substring (i-k+1,i+1);
            ans = sub.toUpperCase()+"-"+ans;
            i-=k;
        }
        String sub = sb.substring(0,i+1).toUpperCase();
        if(sub.length()>0) ans = sub+"-"+ans;
       // System.out.println (ans);    
        return ans.substring(0,ans.length()-1);
    }
}