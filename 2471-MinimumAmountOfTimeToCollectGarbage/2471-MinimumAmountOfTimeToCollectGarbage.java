// Last updated: 8/7/2025, 2:47:26 PM
class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        HashMap<Character,Integer>hmap =new HashMap<>();
        int M=0,G=0,P=0,maxM=Integer.MIN_VALUE,maxP=Integer.MIN_VALUE,maxG=Integer.MIN_VALUE;
        for(int i=0;i<garbage.length;i++){
            String s=garbage[i];
            for(int j=0;j<s.length();j++){
                if(s.charAt(j)=='M'){ 
                    M++;
                    if(maxM!=i) maxM=Math.max(maxM,i);
                }
                if(s.charAt(j)=='G'){ 
                    G++;
                    if(maxG!=i) maxG=Math.max(maxG,i);
                }
                if(s.charAt(j)=='P') {
                    P++;
                    if(maxP!=i) maxP=Math.max(maxP,i);
                }
            }
        }
        for(int i=0;i<maxM;i++) M+=travel[i];
        for(int i=0;i<maxG;i++) G+=travel[i];
        for(int i=0;i<maxP;i++) P+=travel[i];
        return (M+G+P);
    }
}