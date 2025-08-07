// Last updated: 8/7/2025, 2:56:57 PM
class Solution {
    public List<Integer> diffWaysToCompute(String expression) {
     return computeWays(expression,0,expression.length()-1);
    }

    private static List<Integer> computeWays(String expression, int start, int end) {
       List<Integer> result=new ArrayList<>();
       //base Case:single digit is obt
       if(start==end){
         result.add(expression.charAt(start)-'0'); 
         return result;
       }
       if(end-start==1){
            result.add(Integer.parseInt(expression.substring(start,end+1)));
            return result;
       }
       for(int i=start;i<=end;i++){
        if(expression.charAt(i)>='0' && expression.charAt(i)<='9') continue;
        else{
            //splitting into left and right
            char op=expression.charAt(i);
            List<Integer> leftMIntegers=computeWays(expression, start, i-1);
            List<Integer> righIntegers=computeWays(expression, i+1, end);
            for(int left:leftMIntegers){
                for(int right:righIntegers){
                    if(op=='*') result.add(left*right);
                    else if(op=='+') result.add(left+right);
                    else result.add(left-right);
                }
            }
        }
       }
       return result;
    }
}