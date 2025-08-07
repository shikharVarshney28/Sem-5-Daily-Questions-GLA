# Last updated: 8/7/2025, 3:01:07 PM
class Solution:
    def isPalindrome(self, x: int) -> bool:
        rev=0
        n=x
        if x>=0:
            while(n):
                rev=rev*10+n%10
                n//=10
            if rev==x:
                return True
            else:
                return False
        else:
            return False        