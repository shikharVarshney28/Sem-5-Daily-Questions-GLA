// Last updated: 8/7/2025, 3:01:10 PM
class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1) return s;
        int idx=0,i=0,j=0;
        char [][] ch= new char[numRows][s.length()];
        //System.out.println(ch[0][0]);
        while(idx<s.length()){
            while(idx<s.length() && i<numRows && i>=0){
                // no need to change j...
                ch[i++][j]=s.charAt(idx++);
            }
            i-=2;
            while(idx<s.length() && i>=1){
                ch[i--][++j]=s.charAt(idx++);
            }
            j++;
        }
        String ans="";
        for(i=0;i<numRows;i++){
            for(int k=0;k<j;k++){
                if(ch[i][k]>='A' && ch[i][k]<='Z' || ch[i][k]>='a' && ch[i][k]<='z' || ch[i][k]==',' || ch[i][k]=='.') ans+=ch[i][k];
            }
        }
        return ans;
    }
}