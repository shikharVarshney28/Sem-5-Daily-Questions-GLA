# Last updated: 8/7/2025, 3:00:49 PM
class Solution:
    def strStr(self, haystack: str, needle: str) -> int:
        length_needle=len(needle)
        i=0
        while i<len(haystack):
            m=haystack[i:length_needle+i]
            #print(m)
            if m==needle:
                return i
                break
            i+=1
        else:
            return -1