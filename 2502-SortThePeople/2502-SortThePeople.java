// Last updated: 8/7/2025, 2:47:11 PM
class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        TreeMap<Integer,String> t=new TreeMap<>();
        for(int i=0;i<heights.length;i++) t.put(heights[i],names[i]);
        String [] s=new String[t.size()];
        int idx=names.length-1;
        for(int i:t.keySet()){
            s[idx--]=t.get(i);
        }
        return s;
    }
}