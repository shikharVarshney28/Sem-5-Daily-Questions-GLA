// Last updated: 8/7/2025, 2:44:43 PM
class Solution {
    void addOnes(int n,int idx,String s,List<String>ans,int countOnes)
    {
        if(idx>=2 && s.charAt(idx-2)=='0' && s.charAt(idx-1)=='0'){ 
            return;
        }
        if(idx==n){
        ans.add(s);
        return;
        }
        addOnes(n,idx+1,s+'0',ans,countOnes);
        addOnes(n,idx+1,s+'1',ans,countOnes+1);
    }
    public List<String> validStrings(int n) {
        List<String> ans=new ArrayList<>();
        addOnes(n,0,"",ans,0);
        return ans;
    }
}