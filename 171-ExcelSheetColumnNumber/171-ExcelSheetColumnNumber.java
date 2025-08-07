// Last updated: 8/7/2025, 2:57:55 PM
class Solution {
    public int titleToNumber(String columnTitle) {
        int ans=columnTitle.charAt(0)-'A'+1;
        for(int i=1;i<columnTitle.length();i++){
            ans = ans*26 + (columnTitle.charAt(i)-'A'+1);
        }
        return ans;
    }
}