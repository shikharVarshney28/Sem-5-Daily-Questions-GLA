// Last updated: 8/7/2025, 2:50:01 PM
class Solution {
    public int maxUniqueSplit(String s) {
        ArrayList<String> arrList=new ArrayList<>();
        int maxCount[]=new int[1];
        maxSplit(s,0,arrList,maxCount);
        return (maxCount[0]);
    }
    void maxSplit(String s,int idx,ArrayList<String> arrList,int [] maxCount){
        if(idx>=s.length()){
            maxCount[0]=Math.max(maxCount[0],arrList.size());
            return;
        }
        for(int i=idx;i<s.length();i++){
            String subString=s.substring(idx,i+1);
            if(!arrList.contains(subString)){
                arrList.add(subString);
                maxSplit(s, i+1, arrList ,maxCount);
                arrList.remove(arrList.size()-1);
            }
        }
    }
}