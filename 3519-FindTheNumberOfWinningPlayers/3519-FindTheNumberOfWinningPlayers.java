// Last updated: 8/7/2025, 2:44:28 PM
class Solution {
    public int winningPlayerCount(int n, int[][] pick) {
        HashMap<Integer,ArrayList<Integer>> h=new HashMap<>();
        for(int num[]:pick)
        {
            if(!h.containsKey(num[0])) {
                ArrayList<Integer> aa =new ArrayList<>();
                aa.add(num[1]);
                h.put(num[0],aa);
            }else{
                ArrayList<Integer> a=h.get(num[0]);
                a.add(num[1]);
                h.put(num[0],a);
            }
        }
        int count=0;
        for(int i:h.keySet()){
            ArrayList<Integer> a=h.get(i);
            int freq[]=new int[11];
            for(int j:a){
                freq[j]++;
                if(freq[j]>i){
                    count++;
                    break;
                }
            }
}return count;
    }
}