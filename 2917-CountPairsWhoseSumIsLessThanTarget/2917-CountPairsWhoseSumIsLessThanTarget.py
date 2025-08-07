# Last updated: 8/7/2025, 2:45:56 PM
class Solution:
    def countPairs(self, nums: List[int], target: int) -> int:
        count=0
        for i in range(len(nums)):
            for j in range(i+1,len(nums)):
                if nums[i]+nums[j]<target:
                    count+=1
        return count
        