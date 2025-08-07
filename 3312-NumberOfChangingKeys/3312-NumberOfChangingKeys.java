// Last updated: 8/7/2025, 2:45:22 PM
class Solution {
    public int countKeyChanges(String s) {
        s=s.toLowerCase();
        int count=0;
        for(int i=0;i<s.length()-1;i++)
        {
            char ch=s.charAt(i);
            char gh=s.charAt(i+1);
            if(ch!=gh) count++;
        }
        return count;
    }
}