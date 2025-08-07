// Last updated: 8/7/2025, 2:46:57 PM
class Solution {
    public int distinctAverages(int[] nums) {
        Arrays.sort(nums);
        int i=0,j=nums.length-1,count=0;
        float current_avg=0f;
        float arr[]=new float[nums.length/2];
        
        while(i<j)
        {
            float avg=(nums[i]+nums[j])/2f;
            System.out.println(avg);
            arr[i]=avg;
            i++;j--;
        }
        Arrays.sort(arr);
        Stack<Float> st=new Stack<>();
        for(i=0;i<arr.length;i++)
        {
            if(st.size()==0 || st.peek()!=arr[i]) st.push(arr[i]);
        }
        return st.size();
    }
}