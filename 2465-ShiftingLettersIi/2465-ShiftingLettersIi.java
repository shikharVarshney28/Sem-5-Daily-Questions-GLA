// Last updated: 8/7/2025, 2:47:29 PM
class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
        // Line Sweep Alpgorithm
        int arr[]=new int [s.length()];
        for(int shift[]:shifts){
            int i=shift[0],j=shift[1]+1,dir=shift[2];
            if(dir==1){
                //fw
                arr[i]++;
                if(j<s.length()) arr[j]--;
            }else{
                //bw
                arr[i]--;
                if(j<s.length()) arr[j]++;
            }
        }
        StringBuilder snew=new StringBuilder(s);
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=(sum+arr[i])%26;
            if(sum<0) sum+=26;
            char ch=(char)('a'+((s.charAt(i)-'a'+sum)%26));
            snew.setCharAt(i,ch);
        }
        return snew.toString();
    }
}