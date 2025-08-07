// Last updated: 8/7/2025, 2:49:38 PM
class Solution {
    public double averageWaitingTime(int[][] arr) {
      long arrival=0,time=0,sod=0;
      for(int i=0;i<arr.length;i++)
      {
        arrival=arr[i][0];
        if(time>arrival)
        {
            time+=arr[i][1];
            sod=sod+(time-arrival);
        }
        else{
            sod+=arr[i][1];
            time=arr[i][0]+arr[i][1];
        }
      }
      double avg=(double)sod/arr.length;
      return avg; 
    }
}