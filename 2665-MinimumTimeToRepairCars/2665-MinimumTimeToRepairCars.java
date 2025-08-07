// Last updated: 8/7/2025, 2:46:37 PM
class Solution {
    public long repairCars(int[] ranks, int cars) {
        int max=0;
        for(int rank:ranks){
            max= Math.max(max,rank);
        }
        long st =1 , end=max*(long)Math.pow(cars,2),ans=0;
        while(st<=end){
            long mid = st+(end - st)/2;
            if(isPossible(ranks,cars,mid)){
                ans=mid;
                end= mid -1;
            }else st= mid+1;
        }
        return ans;
    }
    boolean isPossible(int[] arr,int k,long mid){
        for(int i=0;i<arr.length;i++){
            int cars=0;
            while(arr[i]*(long)Math.pow(cars,2)<=mid && cars<=k) cars++;
            k-=(cars-1);
            if(k<=0) return true;
        }
        return false;
    }
}