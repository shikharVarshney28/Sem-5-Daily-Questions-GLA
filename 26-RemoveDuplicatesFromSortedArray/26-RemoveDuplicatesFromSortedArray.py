# Last updated: 8/7/2025, 3:00:52 PM
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        nums[:] = sorted(set(nums))
        return len(nums)