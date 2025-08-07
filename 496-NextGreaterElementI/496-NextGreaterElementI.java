// Last updated: 8/7/2025, 2:55:10 PM
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) 
    {
        HashMap<Integer,Integer> h=new HashMap<>();
        Stack<Integer> st=new Stack<>();
        int n=nums2.length-1;
        h.put(nums2[n],-1);
        st.push(nums2[n]);
        for(int i=n-1;i>=0;i--)
        {
            while(st.size()!=0 && nums2[i]>st.peek()) st.pop();
            if(st.size()==0) h.put(nums2[i],-1);
            else h.put(nums2[i],st.peek());
            st.push(nums2[i]);
        }
        for(int i=0;i<nums1.length;i++)
        {
            if(h.containsKey(nums1[i])) nums1[i]=h.get(nums1[i]);
        }
        return nums1;
    }
}