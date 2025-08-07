# Last updated: 8/7/2025, 2:58:06 PM
class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        f={}
        for i in nums:
            f[i]=f.get(i,0)+1
        for i in f.keys():
            if f[i]>len(nums)//2:
                return i
                break
            