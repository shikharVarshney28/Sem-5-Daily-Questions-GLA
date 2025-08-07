// Last updated: 8/7/2025, 2:50:43 PM
class Solution {
    public int maxScore(String s) {
        int [] zeros=new int[s.length()];
        int []ones=new int[s.length()];
        zeros[0]=s.charAt(0)=='0' ? 1 :0;
        ones[0]=s.charAt (1)=='1'?1:0;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)=='0'){
                zeros[i]=zeros[i-1]+1;
                ones[i]=ones[i -1];
            }else{
                ones[i]=ones[i-1]+1;
                zeros[i]=zeros[i -1];
            }
        }
        int maxSum=0;
        for(int i=0;i<s.length()-1;i++){
            maxSum =Math.max (maxSum, zeros[i] + (ones[s.length ()-1] - ones[i]));
        }
        return maxSum;
    }
}