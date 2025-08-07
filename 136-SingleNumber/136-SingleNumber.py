# Last updated: 8/7/2025, 2:58:44 PM
class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        for i in nums:
            if nums.count(i)==1:
                return i