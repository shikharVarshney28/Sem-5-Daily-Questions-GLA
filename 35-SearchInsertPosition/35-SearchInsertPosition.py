# Last updated: 8/7/2025, 3:00:43 PM
class Solution:
    def searchInsert(self, nums: List[int], target: int) -> int:
        f,m=1,0
        for i in nums:
            if i == target:
                m=nums.index(i)
                break
            elif target<i:
                m=nums.index(i)
                break
        else:
            m=len(nums)
        return m