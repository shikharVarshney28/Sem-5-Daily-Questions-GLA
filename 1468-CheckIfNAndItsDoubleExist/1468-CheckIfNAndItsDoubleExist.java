// Last updated: 8/7/2025, 2:51:11 PM
class Solution {
    public boolean checkIfExist(int[] arr) {
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]*2 || arr[j]==arr[i]*2) return true;
            }
            //return false;
        }
        return false;
    }
}