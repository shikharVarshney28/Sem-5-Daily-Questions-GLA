// Last updated: 8/7/2025, 3:00:33 PM
class Solution {
    public int trap(int[] heights) {
        int leftMax[]=new int[heights.length];
        int rightMax[]=new int[heights.length];
        int max=Integer.MIN_VALUE;
        for(int i=0;i<heights.length;i++)
        {
            max=Math.max(max,heights[i]);
            leftMax[i]=max;
        }
         max=Integer.MIN_VALUE;
        for(int i=heights.length-1;i>=0;i--)
        {
            max=Math.max(max,heights[i]);
            rightMax[i]=max;
        }
        int ans=0;
        for(int i=0;i<heights.length;i++)
        {
            ans=ans+Math.min(leftMax[i],rightMax[i])-heights[i];
        }
        return ans;
    }
}