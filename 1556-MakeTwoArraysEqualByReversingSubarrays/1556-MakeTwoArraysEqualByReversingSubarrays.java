// Last updated: 8/7/2025, 2:50:40 PM
class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<target.length;i++){
             if(!h.containsKey(target[i]))
                h.put(target[i],1);
            else h.put(target[i],h.get(target[i])+1);
             }
            System.out.println(h);
        for(int i:arr){
            if(h.containsKey(i) && h.get(i)>0) h.put(i,h.get(i)-1);
            else return false;

        }
        return true;
    }
}