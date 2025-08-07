# Last updated: 8/7/2025, 2:57:04 PM
class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        f=[0]*26
        k=[0]*26
        for i in s:
            #print(ord('a'))
            f[ord(i)-97]+=1
        #print(f)
        for i in t:
            #print(ord('a'))
            k[ord(i)-97]+=1
        #print(f)
        if k==f:
            return True
        else:
            return False
        