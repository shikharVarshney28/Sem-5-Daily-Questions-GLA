// Last updated: 8/7/2025, 2:50:46 PM
class Solution {
    public int[] processQueries(int[] arr, int m) {
        ArrayList<Integer> arrList=new ArrayList<>();
        for(int i=1;i<=m;i++) arrList.add(i);
        for(int i=0;i<arr.length;i++){
            int idxDiff=arrList.indexOf(arr[i]);
            arr[i]=idxDiff;
            arrList.addFirst(arrList.remove(idxDiff));
        }
        return arr;
    }
}