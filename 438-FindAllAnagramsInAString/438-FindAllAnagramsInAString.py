# Last updated: 8/7/2025, 2:55:35 PM
class Solution:
    def findAnagrams(self, s: str, p: str) -> List[int]:
        ans=[]
        q="".join(sorted(p))
        for i in range(0,len(s)-len(p)+1):
            p="".join(sorted(s[i:i+len(p)]))
            if p==q:
                ans.append(i)
        return ans