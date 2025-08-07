// Last updated: 8/7/2025, 2:52:53 PM
class Solution {
    public void MergeSort(int arr[],int start,int mid,int end)
    {
        int n1=mid-start+1,n2=end-mid;
        int left[]= new int[n1];
        int right[]= new int[n2];
        for(int i=0;i<n1;i++) left[i]=arr[start+i];
        for(int i=0;i<n2;i++) right[i]=arr[mid+1+i];
        //Comparison
        int i=0,j=0,k=start;
        while(i<n1 && j<n2)
        {
            if(left[i]<right[j]) arr[k++]=left[i++];
            else arr[k++]=right[j++];
        }
        while(i<n1) arr[k++]=left[i++];
        while(j<n2) arr[k++]=right[j++];

    }
    public void merge(int [] arr,int start,int end)
    {
        if(start>=end) return;
        int mid=(start+end)/2;
        merge(arr,start,mid);
        merge(arr,mid+1,end);
        MergeSort(arr,start,mid,end);
    }
    public int[] sortArray(int[] nums) {
        merge(nums,0,nums.length-1);
        return nums;
    }
}