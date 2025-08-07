# Last updated: 8/7/2025, 3:00:11 PM
class Solution:
    def lengthOfLastWord(self, s: str) -> int:
        l=s.split();
        return len(l[-1])