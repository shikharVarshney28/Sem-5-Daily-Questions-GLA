// Last updated: 8/7/2025, 2:45:38 PM
class Solution {
    public int countTestedDevices(int[] arr) {
        int t=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0) continue;
            else if(arr[i]>0)
            {
                t++;
                for(int j=i+1;j<arr.length;j++)
                {
                    if(arr[j]==0) continue;
                    arr[j]--;
                }
            }
        }
        return t;
    }
}