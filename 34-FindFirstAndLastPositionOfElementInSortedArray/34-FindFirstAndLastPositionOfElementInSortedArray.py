# Last updated: 8/7/2025, 3:00:45 PM
class Solution:
    def searchRange(self, nums: List[int], target: int) -> List[int]:
        l=[]
        f=1
        for i in range(len(nums)):
            if nums[i]==target:
                l.append(i)
                f=0
                break
        for i in range(len(nums)-1,-1,-1):
            if nums[i]==target:
                l.append(i)
                break
        if f:
            return [-1,-1]
        else:
            return l