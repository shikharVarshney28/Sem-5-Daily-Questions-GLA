// Last updated: 8/7/2025, 2:54:14 PM
class Solution {
    int form(int n,String s,String prev,int c){
        //to just copy the prev s
        if(s.length () >n) return Integer.MAX_VALUE;
        if(s.length()==n) return c;
        int copy=form(n,s+prev,prev,1);
        int paste=form(n,s+s,s,2);
        if(copy==Integer.MAX_VALUE  && paste==Integer.MAX_VALUE) return Integer.MAX_VALUE;
        else if(copy==Integer.MAX_VALUE) return paste+c;
        else if(paste==Integer.MAX_VALUE) return copy+c;
        return Math.min (copy,paste)+c;
    }
    public int minSteps(int n) {
        if(n==1) return 0;
        return form(n,"A","A",1);
    }
}