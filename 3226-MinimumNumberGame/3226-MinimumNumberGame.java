// Last updated: 8/7/2025, 2:45:34 PM
class Solution {
    void swap(int []arr,int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public int[] numberGame(int[] arr) {
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i+=2)
        {
            swap(arr,i,i+1);
        }
        return arr;

    }
}