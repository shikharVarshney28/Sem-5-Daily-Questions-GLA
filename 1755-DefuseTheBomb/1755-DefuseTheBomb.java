// Last updated: 8/7/2025, 2:49:49 PM
class Solution {
    public int[] decrypt(int[] code, int i) {
        int ans[]=new int[code.length];
        if(i>0){
            for(int k=0;k<code.length;k++){
            int sum=0,idx=k+1,atIdx=0;
            for(int j=1;j<=i;j++){
                sum= sum + code[idx++%code.length];
            }
            ans[k] = sum;
            }
            return ans;
        }
        if(i<0){
            for(int k=code.length -1;k>=0;k--){
                int sum=0,idx= k -1 <0 ? code.length-1 : k- 1,loop= 0-i;
                for(int j=i;j<0;j++){
                    sum += code[idx];
                    idx = (idx-1)<0 ? code.length -1 : idx - 1;
                }
                ans[k]=sum;
            }
            return ans;
        }
        return new int[code.length];
    }
}






