// Last updated: 8/7/2025, 2:42:59 PM
class Solution {
    void Sort(List<String[]>s){
        Collections.sort(s,new Comparator <String[]>(){
            public int compare(String a[],String b[]){
                if(!(a[1].equals(b[1])))
                return a[1].charAt(0)-b[1].charAt(0);
                return a[0].compareTo(b[0]);
            }
        });
    }
    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
        List<String[]> ans = new ArrayList <>();
        for(int i=0;i<code.length;i++){
            if(isActive[i] && (businessLine[i].equals("electronics")||  businessLine[i].equals("grocery") || businessLine[i].equals("pharmacy")|| businessLine[i].equals("restaurant")) && find(code[i])){
                ans.add(new String[]{code[i],businessLine[i]});
            }
            
        }
        Sort(ans);
        List<String> res = new ArrayList <>();
        for(String []s:ans) res.add(s[0]);
        return res;
    }
    boolean find(String s){
        if(s.length ()==0) return false;
        for(char ch : s.toCharArray ()){
            if(!((ch>='a' && ch<='z') || (ch>='A' && ch<='Z') || (ch=='_')|| (ch>='0' && ch<='9'))) return false;
        }
        return true;
    }
}