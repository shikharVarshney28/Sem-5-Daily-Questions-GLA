// Last updated: 8/7/2025, 2:56:51 PM
class Solution {
    public int nthUglyNumber(int n) {
        int arr[] = new int[n + 1];
        arr[1]=1;
        int i = 1, j = 1, k = 1;//this is first igly numb
        //for 2 3 4th....ugly num
        for (int m = 2; m <= n; m++) {
            int ith = arr[i] * 2;
            int jth = arr[j] * 3;
            int kth = arr[k] * 5;
            arr[m] = Math.min(Math.min(ith, jth), kth);
            //aab jiska ka bhi pointer mun hai uska inc krdo
            if (ith == arr[m])
                i++;
            if (jth == arr[m])
                j++;
            if (kth == arr[m])
                k++;
        }
        return arr[n];
    }
}