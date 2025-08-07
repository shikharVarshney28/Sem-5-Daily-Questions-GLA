// Last updated: 8/7/2025, 2:44:15 PM
class Solution {
    public int maxGoodNumber(int[] arr) {
        String s[]=new String[3];
        for(int i=0;i<3;i++){
            s[i]=Integer.toBinaryString(arr[i]);
        }
        int max=Integer.MIN_VALUE;
        int i=0;
        while(i<3)
        {
            int j=i+1,k=i+2;
            for(int loop=1;loop<3;loop++){
                j=(j)%3;k=(k)%3;
                max=Math.max(max,Integer.parseInt((s[i] + s[j] + s[k]),2));
            j++;k+=2;                                                        }
                                                                                                                    i++;
                                                                                                                              
                                                                                                                                    }
        return (max);
    }
}