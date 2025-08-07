// Last updated: 8/7/2025, 2:54:47 PM
class Solution {
    public int findMinDifference(List<String> timePoints) {
        int[] min=new int[timePoints.size()];
        int idx=0,ans=Integer.MAX_VALUE;
        for(String hrs:timePoints)
        {
            int hr=Integer.parseInt(hrs.substring(0,2));
            //if(hr==0) hr=24;  // 00--- 24 hr
            min[idx++]= hr*60+Integer.parseInt(hrs.substring(3,5));
        }
        Arrays.sort(min);
        for(int i:min)
        System.out.print(i+" ");
        for(int i=0;i<min.length-1;i++)
        {
            ans=Math.min(ans,Math.abs(min[i]-min[i+1%min.length]));
            System.out.println(ans);
        }
        ans=Math.min(ans,Math.abs(1440+min[0]-min[min.length-1]));
        return ans;
    }
}