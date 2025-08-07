// Last updated: 8/7/2025, 2:47:02 PM
class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int m=nums1.length,xor=0,n=nums2.length;
        if(m%2!=0){
            for(int i:nums2) xor^=i;
        }
        if(n%2!=0) {
            for(int i:nums1) xor^=i;
        }
        return xor;
    }
}