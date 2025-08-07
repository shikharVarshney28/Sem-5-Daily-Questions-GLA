// Last updated: 8/7/2025, 2:47:32 PM
class Solution {
    public String smallestNumber(String pattern) {
        //Skip "D" and place the count I on that i and place all inc count before the index of I
        int ans[]=new int[pattern.length()+1];
        int count=1;
        for(int i=0;i<=pattern.length();i++){
            if(i==pattern.length() || pattern.charAt(i)=='I'){
                ans[i]=count++;
                int idx=i-1;
                while(idx>=0 && ans[idx] == 0){
                    ans[idx--] =count++;
                }
            }
        }
        StringBuilder s=new StringBuilder();
        for(int i:ans) s.append(i);
        return s.toString();
    }
}