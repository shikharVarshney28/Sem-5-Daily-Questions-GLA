# Last updated: 8/7/2025, 3:01:13 PM
class Solution:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        nums1.extend(nums2)
        nums1.sort()
        l=len(nums1)
        if l%2!=0:
            m=nums1[l//2]
        else:
            m=(nums1[l//2]+nums1[l//2-1])/2
        return m