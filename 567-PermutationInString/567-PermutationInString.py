# Last updated: 8/7/2025, 2:54:37 PM
class Solution:
    def checkInclusion(self, s1: str, s2: str) -> bool:
        i=0
        f=1
        s1=''.join(sorted(s1))
        while(i<len(s2)):
            m=s2[i:len(s1)+i]
            m=''.join(sorted(m))
            if m==s1:
                f=0
                return True
                break
            i+=1
        if f:
            
            return False